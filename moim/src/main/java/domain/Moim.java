package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor

public class Moim {
	
	@Id	
	@GeneratedValue
	@Column(name = "Moim_ID")
	private Long id;
	
	private String name;
	
	private Date birthday;
	
	@OneToMany(mappedBy="moim")
	private List<Member_Moim> member_moim;
	
}
