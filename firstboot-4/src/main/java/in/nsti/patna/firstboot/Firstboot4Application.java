package in.nsti.patna.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Firstboot4Application {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(Firstboot4Application.class, args);
//		System.out.println("hello world");
//		Student s1 = new Student();
//		s1.patna();
		Student s1 = cxt.getBean(Student.class);
		s1.patna();

	}

}
