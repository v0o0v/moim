package com.v0o0v.moim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.v0o0v.moim.domain.Member;
import com.v0o0v.moim.repository.MemberRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Autowired
	MemberRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Override
	public void run(String... args) throws Exception {
		// save a couple of customers

		for (int i = 1; i <= 10; i++) {
			repository.save(new Member("Member" + i, "Description_" + i));
		}

	}

}
