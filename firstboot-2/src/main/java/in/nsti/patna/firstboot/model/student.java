package in.nsti.patna.firstboot.model;


import org.springframework.stereotype.Component;
@Component
//@Scope("prototype")
public class student {
	private String name;
	private String mail;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "student [name=" + name + ", mail=" + mail + ", city=" + city + "]";
	}
	
	

}
