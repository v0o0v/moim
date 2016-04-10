package com.v0o0v.moim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.v0o0v.moim.domain.Member;


@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MemberRepository extends JpaRepository<Member, Long> {

	List<Member> findByName(@Param("name") String name);

	List<Member> findByNameStartsWithIgnoreCase(String name);

	List<Member> findByNameAndDesc(String name, String desc);
}
