package com.v0o0v.moim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v0o0v.moim.domain.Member;
import com.v0o0v.moim.repository.MemberRepository;

@RestController
public class CustomerController {

	@Autowired
	MemberRepository customerRepository;

//	@RequestMapping("/customers/{id}")
//	public Member getCustomer(@PathVariable long id) {
//		return this.customerRepository.findOne(id);
//	}
}
