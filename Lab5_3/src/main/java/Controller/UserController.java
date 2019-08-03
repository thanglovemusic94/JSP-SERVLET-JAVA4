package Controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Account;
import dao.UserDAO;
import dao.UserDAOImpl;

@WebServlet("/UserController")
public class UserController extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private UserDAOImpl userDAO;
//    private UserDAOImpl userDAO = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/register.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("usename");
        String pass = req.getParameter("password");
        Account acc = new Account(user, pass);
        if (userDAO.Insert(acc)){
            resp.sendRedirect(req.getContextPath()+ "/HomeController");
        }
    }
}
