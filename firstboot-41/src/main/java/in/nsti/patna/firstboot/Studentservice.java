package in.nsti.patna.firstboot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Studentservice {
	
	@Autowired
	StudentRepository sR;
	
	public String saveSt(String id, String name, String mail, String city, MultipartFile file) {
		try {
			String uploadurl = "src/main/resources/static/photos";
			String filename=System.currentTimeMillis()+file.getOriginalFilename();
			Path path = Paths.get(uploadurl+File.separator+filename);
			Files.copy(file.getInputStream(), path);
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setCity(city);
			s.setMail(mail);
			s.setPhotoname(filename);
			sR.save(s);
			return "saved";
		}
		catch(Exception e){
			e.printStackTrace();
			return " not saved";
		}
	}
	
	public Iterable<Student> show(){
		return sR.findAll();
	}

}
