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

@WebServlet("/customer/update")
public class UpdateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateCustomerController() {
		// Do Nothing
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String custId = request.getParameter("custId");

		if (custId == "" || custId == null)
			request.getRequestDispatcher("/").forward(request, response);
		else {
			Long id = Long.parseLong(custId);
			CustomerDao customerDao = CustomerDaoImpl.getInstance();
			Customer customer = customerDao.findCustomerById(id);

			request.setAttribute("customer", customer);

			request.getRequestDispatcher("/").forward(request, response);
		}
	}
}
