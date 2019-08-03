package Controller;

import BEAN.ThueBao;
import DAO.IindexDAO;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/find")
public class index2Controller extends HttpServlet {
    @Inject
    private IindexDAO indexDAO;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        List<ThueBao> list = new ArrayList<ThueBao>();
        list = indexDAO.findAll(name);
        req.setAttribute("msg", "tra cuu thanh cong");
        req.setAttribute("list", list);
        req.getRequestDispatcher("/WEB-INF/web/home.jsp").forward(req, resp);
    }
}
