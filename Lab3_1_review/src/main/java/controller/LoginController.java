package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.LoginDao;

/**
 * Servlet implementation class LoginController
 */

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String homePage = "index.jsp";
	private static final String register = "register.jsp";
	private static final String show = "show.jsp";
	private static final String wellcome = "wellcome.jsp";
	private static final String failse = "failse.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usename = request.getParameter("useName");
		String password = request.getParameter("passWord");
		String action = request.getParameter("btnAction");
		String url = failse;
		
		User user = new User(usename, password);
		boolean check = LoginDao.checkLogin(user);
		
		if (action.equals("Login")) {
			if (check) {
				url = wellcome;
				HttpSession session = request.getSession(true);
				session.setAttribute("name", usename);
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);
			}
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}else if (action.equals("try again")) {
			url = homePage;
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}else if (action.equals("register")) {
			url = register;
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}else if (action.equals("Search")) {
			url = show;
			String name = request.getParameter("useNameSearch");
			request.setAttribute("useNameSearch", name );
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}
			
	}

}
