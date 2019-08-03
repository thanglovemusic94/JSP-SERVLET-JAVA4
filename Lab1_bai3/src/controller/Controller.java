package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CalDao;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html ; charset = UTF-8");
		PrintWriter out = response.getWriter();
		String a = request.getParameter("number1");
		String b = request.getParameter("number2");

		String action = request.getParameter("action");

		if (action.equals("+") && CalDao.check(a, b)) {
			out.println(a + " + " + b + " = " + CalDao.cong(a, b));
		} else if (action.equals("-") && CalDao.check(a, b)) {
			out.println(a + " - " + b + " = " + CalDao.tru(a, b));
		} else if (action.equals("*") && CalDao.check(a, b)) {
			out.println(a + " * " + b + " = " + CalDao.nhan(a, b));
		} else if (action.equals("/") && CalDao.check(a, b)) {
			try {
				out.println(a + " / " + b + " = " + CalDao.chia(a, b));
			} catch (Exception e) {
				out.println("da xay ra loi chia 0");
			}
		} else if (action.equals("hello")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/xinchao.jsp");
			rd.forward(request, response);
		} else {
			out.println("ban chua nhap dung du lieu hoac chua nhap du lieu");
		}
	}
}
