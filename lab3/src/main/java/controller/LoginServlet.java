package controller;

import bean.LoginBean;
import dao.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        LoginBean loginBean = new LoginBean();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        if (loginDao.validate(loginBean)) {
//                response.sendRedirect("/WEB-INF/loginsuccess.jsp");
            request.getRequestDispatcher("/WEB-INF/loginsuccess.jsp").forward(request, response);
        } else {
//                response.sendRedirect("/WEB-INF/index.jsp");
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        }
    }
}
