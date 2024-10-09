package in.nsti.patna.firstboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Firstboot32Application {
	
	@Autowired
	MailServ EMS;

	public static void main(String[] args) {
		SpringApplication.run(Firstboot32Application.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		String toEmail="damodartiwari001@gmail.com";
		String subj="Test Maiol from Spring";
		String body="<h1>Test E-Mail</h1>";
		EMS.sendMail(toEmail, subj,body);
	}

}
