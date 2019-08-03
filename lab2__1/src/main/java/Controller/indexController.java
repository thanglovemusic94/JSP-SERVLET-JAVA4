package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.ThueBao;
import DAO.IindexDAO;

@WebServlet("/ab")
public class indexController extends HttpServlet {
    @Inject
    private IindexDAO indexDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/web/display.jsp").forward(req, resp);

    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        List<ThueBao> list = new ArrayList<ThueBao>();
//        list = indexDAO.findAll(name);
//        req.setAttribute("msg", "tra cuu thanh cong");
//        req.setAttribute("list", list);
//        req.getRequestDispatcher("/WEB-INF/web/home.jsp").forward(req, resp);
//    }
}
