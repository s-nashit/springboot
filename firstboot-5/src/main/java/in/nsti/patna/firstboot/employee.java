package in.nsti.patna.firstboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class employee {
	
	@Id

	@Column(name="Name")
	private String name;
	@Column
	private String city;
	@Column(name="E-Mail")
	private String mail;


}
