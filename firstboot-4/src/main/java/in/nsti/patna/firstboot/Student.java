package in.nsti.patna.firstboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student implements Trainer{
	
	@Autowired
	public Manager nashit;
	
	public void patna() {
		
		nashit.content();
		
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		
	}



}
