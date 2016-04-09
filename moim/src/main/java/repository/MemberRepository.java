package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

	List<Member> findByNameStartsWithIgnoreCase(String name);
	List<Member> findByNameAndDesc(String name, String desc);
}
