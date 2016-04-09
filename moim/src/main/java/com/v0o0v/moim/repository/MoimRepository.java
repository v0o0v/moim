package com.v0o0v.moim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v0o0v.moim.domain.Member;
import com.v0o0v.moim.domain.Moim;

public interface MoimRepository extends JpaRepository<Moim, Long> {

}
