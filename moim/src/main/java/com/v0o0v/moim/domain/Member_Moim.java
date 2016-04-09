package com.v0o0v.moim.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Member_Moim {

	@Id
	@GeneratedValue
	@Column(name = "Member_Moim_ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "Member_ID")
	private Member member;

	@ManyToOne
	@JoinColumn(name = "Moim_ID")
	private Moim moim;

	private Date joinDate;

}
