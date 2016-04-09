package com.v0o0v.moim.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Member {

	@Id
	@GeneratedValue
	@Column(name = "Member_ID")
	private Long id;

	private String name;

	private String desc;

	@OneToMany(mappedBy = "member", cascade=CascadeType.ALL, fetch=FetchType.EAGER)			
	private List<Member_Moim> member_moim = new ArrayList<>();

	public Member(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

}
