package in.nsti.patna.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstbootApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(FirstbootApplication.class, args);
		
		
		
		dev d= cxt.getBean(dev.class);
		d.build();
	}

}
