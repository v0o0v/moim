package com.v0o0v.moim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.v0o0v.moim.domain.Moim;

@RepositoryRestResource(path = "moims")
public interface MoimRepository extends JpaRepository<Moim, Long> {

}
