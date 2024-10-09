package in.nsti.patna.firstboot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.nsti.patna.firstboot.model.student;

@SpringBootApplication
public class Firstboot2Application {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(Firstboot2Application.class, args);
		student s1 = cxt.getBean(student.class);
		s1.setName("Nashit");
		s1.setMail("nashit@gmail.com");
		s1.setCity("Patna");
		
	}

}
