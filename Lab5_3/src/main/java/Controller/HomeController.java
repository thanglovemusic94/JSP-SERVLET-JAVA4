package Controller;

import bean.Account;
import dao.UserDAOImpl;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private UserDAOImpl userDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getContextPath());
        System.out.println(req.getServletPath());
        System.out.println(req.getRequestURI());
        List<Account> list = userDAO.findAll();
        req.setAttribute("list", list);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/home.jsp");
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
