package in.nsti.patna.firstboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServ {
	
	@Autowired
	JavaMailSender JMS;
	
	public void sendMail(String toEmail, String subj, String body) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("nashit.jksb@gmail.com");
		msg.setTo(toEmail);
		msg.setSubject(subj);
		msg.setText(body);
		
		try {
			JMS.send(msg);
			System.out.println("mail sent to: "+ toEmail);
			
		}
		catch(Exception e){
			System.out.println("falied");
		}
	}

}
