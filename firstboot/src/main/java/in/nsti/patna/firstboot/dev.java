package in.nsti.patna.firstboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dev {
	
	@Autowired
	lapt l;
	@Autowired
//	public void setdev(lapt l) {
//		this.l = l;
		
//	}
	public void build() {
		l.compile();
		System.out.println("working..");
	}

}
