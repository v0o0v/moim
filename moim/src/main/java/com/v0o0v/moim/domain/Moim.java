package com.v0o0v.moim.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class Moim {

	@Id
	@GeneratedValue
	@Column(name = "Moim_ID")
	private Long id;

	@NonNull
	private String name;

	@NonNull
	private Date birthday;

	@OneToMany(mappedBy = "moim")
	private List<Member_Moim> member_moim;

}
