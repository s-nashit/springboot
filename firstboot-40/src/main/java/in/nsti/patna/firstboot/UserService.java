package in.nsti.patna.firstboot;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserService {
	
	@Autowired
	UserRepo uR;
	
	public String reg(String id, String name, String mail, String dob, MultipartFile file) {
		
		try {
			String uploadurl = "src/main/resources/static/photos";
			String filename = System.currentTimeMillis()+file.getOriginalFilename();
			Path path = Paths.get(uploadurl + File.separator + filename);
			User u = new User();
			u.setName(name);
			u.setMail(mail);
			u.setDob(dob);
			u.setFilename(filename);
			uR.save(u);
			return "redirect:/";
			
		}
		catch(Exception e) {
			return "redirect:/";
		}
	}



}
