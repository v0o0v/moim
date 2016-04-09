package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Member;
import repository.MemberRepository;

@RestController
public class CustomerController {

	@Autowired
	MemberRepository customerRepository;

	@RequestMapping("/customers/{id}")
	public Member getCustomer(@PathVariable long id) {
		return this.customerRepository.findOne(id);
	}
}
