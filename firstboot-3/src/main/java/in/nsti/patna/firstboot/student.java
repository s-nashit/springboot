package in.nsti.patna.firstboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="patna")
public class student {
	
	@Id
	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private String age;
	
	@Column(name = "City")
	private String city;

}
