package in.nsti.patna.firstboot;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	String dob;
	String mail;
	String city;
	String passw;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	public User(Long id, String name, String dob, String mail, String city, String passw) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.mail = mail;
		this.city = city;
		this.passw = passw;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

}
