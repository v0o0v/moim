package domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@Entity
public class Member {

	@Id
	@GeneratedValue
	@Column(name = "Member_ID")
	private Long id;

	private String name;

	private String desc;

	@OneToMany(mappedBy = "member")
	private List<Member_Moim> member_moim;

	public Member(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

}
