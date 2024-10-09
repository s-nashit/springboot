package in.nsti.patna.firstboot;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Trainer{
	public void content() {
		System.out.println("content create...");
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		
	}
	
}
