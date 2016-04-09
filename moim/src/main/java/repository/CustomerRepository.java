package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import domain.Member;

public interface CustomerRepository extends JpaRepository<Member, Long> {

	List<Member> findByLastNameStartsWithIgnoreCase(String lastName);
}
