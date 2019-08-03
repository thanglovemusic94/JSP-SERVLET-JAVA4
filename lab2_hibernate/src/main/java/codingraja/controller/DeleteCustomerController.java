package codingraja.controller;

import codingraja.dao.CustomerDao;
import codingraja.dao.impl.CustomerDaoImpl;


import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/customer/delete")
public class DeleteCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private CustomerDao CustomerDaoImpl;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String custId = request.getParameter("custId");

		if (custId == "" || custId == null)
			request.getRequestDispatcher("/").forward(request, response);
		else {
			Long id = Long.parseLong(custId);
			CustomerDaoImpl.deleteCustomer(id);
			response.sendRedirect(request.getContextPath() + "/");
		}
	}
}
