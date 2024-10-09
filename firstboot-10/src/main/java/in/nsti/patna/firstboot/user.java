package in.nsti.patna.firstboot;

public class user {
	String name;
	String mail;
	String phone;
	
//	getters/seetters/constr/to string
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public user(String name, String mail, String phone) {
		super();
		this.name = name;
		this.mail = mail;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", mail=" + mail + ", phone=" + phone + "]";
	}
	
	
}
