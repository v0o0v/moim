package com.v0o0v.moim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.v0o0v.moim.domain.Member;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends JpaRepository<Member, Long> {

	List<Member> findByName(String name);

	List<Member> findByNameStartsWithIgnoreCase(String name);

	List<Member> findByNameAndDesc(String name, String desc);
}
