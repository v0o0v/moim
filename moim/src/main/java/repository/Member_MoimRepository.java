package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Member_Moim;
import domain.Moim;

public interface Member_MoimRepository extends JpaRepository<Member_Moim, Long> {
	

}
