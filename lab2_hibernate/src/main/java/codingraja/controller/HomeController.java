package codingraja.controller;

import codingraja.dao.CustomerDao;
import codingraja.dao.impl.CustomerDaoImpl;
import codingraja.domain.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class HomeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static CustomerDao customerDao = CustomerDaoImpl.getInstance();

    public HomeController() {
        // Do Nothing
    }

    public static void main(String[] args) {
        List<Customer> customers = customerDao.findAllCustomers();
        System.out.println(customers);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Customer> customers = customerDao.findAllCustomers();

        request.setAttribute("customerList", customers);

        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
