package com.v0o0v.moim;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.v0o0v.moim.domain.Member;
import com.v0o0v.moim.domain.Member_Moim;
import com.v0o0v.moim.domain.Moim;
import com.v0o0v.moim.repository.MemberRepository;
import com.v0o0v.moim.repository.Member_MoimRepository;
import com.v0o0v.moim.repository.MoimRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	MoimRepository moimRepository;
	
	@Autowired
	Member_MoimRepository member_MoimRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Override
	public void run(String... args) throws Exception {
		// save a couple of customers

		for (int i = 1; i <= 10; i++) {			
			memberRepository.save(new Member("Member" + i, "Description_" + i));
			moimRepository.save(new Moim("Moim"+i,new Date()));
		}
		
		Member_Moim m1m1 = new Member_Moim();
		m1m1.setMember(memberRepository.findOne(1L));
		m1m1.setMoim(moimRepository.findOne(1L));
		member_MoimRepository.save(m1m1);
		
		Member_Moim m1m2 = new Member_Moim();
		m1m2.setMember(memberRepository.findOne(1L));
		m1m2.setMoim(moimRepository.findOne(2L));
		member_MoimRepository.save(m1m2);
		
		Member_Moim m2m1 = new Member_Moim();
		m2m1.setMember(memberRepository.findOne(2L));
		m2m1.setMoim(moimRepository.findOne(1L));
		member_MoimRepository.save(m2m1);
	}

}
