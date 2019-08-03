package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html ; charset = UTF-8");

		
		String  user=request.getParameter("name");
		String  pass=request.getParameter("password");

		
		String login= request.getParameter("login");
		if(login.equals("login")) {
		if (user.equals("hhh") && pass.equals("hhh")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/success.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/failse.jsp");
			rd.forward(request, response);
		}	
	}
	}
}
