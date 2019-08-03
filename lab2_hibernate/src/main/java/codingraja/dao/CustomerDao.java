package codingraja.dao;


import codingraja.domain.Customer;
import java.util.List;

public interface CustomerDao {
	Long saveCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Long id);

	Customer findCustomerById(Long id);

	List<Customer> findAllCustomers();
}
