package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable long id) {
		return this.customerRepository.findOne(id);
	}
}
