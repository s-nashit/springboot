package in.nsti.patna.firstboot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	String name;
	String city;
	String mail;
	String age;
	String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Student(String name, String city, String mail, String age, String phone) {
		super();
		this.name = name;
		this.city = city;
		this.mail = mail;
		this.age = age;
		this.phone = phone;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", mail=" + mail + ", age=" + age + ", phone=" + phone
				+ "]";
	}
	
	
	
	

}
