package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Member;
import domain.Moim;

public interface MoimRepository extends JpaRepository<Moim, Long> {

}
