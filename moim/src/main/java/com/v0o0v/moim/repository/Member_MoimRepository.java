package com.v0o0v.moim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.v0o0v.moim.domain.Member_Moim;

public interface Member_MoimRepository extends JpaRepository<Member_Moim, Long> {

}
