package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import domain.Person;

public interface CustomerRepository extends JpaRepository<Person, Long> {

	List<Person> findByLastNameStartsWithIgnoreCase(String lastName);
}
