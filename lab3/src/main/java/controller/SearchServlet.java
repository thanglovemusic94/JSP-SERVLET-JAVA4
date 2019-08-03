package controller;

import bean.LoginBean;
import dao.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String user = req.getParameter("user");
        List<LoginBean> list = new ArrayList<LoginBean>();
        list = loginDao.infor();
        req.setAttribute("list" , list);
        System.out.println(list);
        req.getRequestDispatcher("/WEB-INF/loginsuccess.jsp").forward(req, resp);
    }
}
