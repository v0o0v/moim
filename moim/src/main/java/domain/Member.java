package domain;

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

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Member {

	@Id	
	@GeneratedValue
	@Column(name = "Member_ID")
	private Long id;

	@NonNull private String name;
	
	@NonNull private String desc;
	
	@OneToMany(mappedBy="member")
	private List<Member_Moim> member_moim;

}
