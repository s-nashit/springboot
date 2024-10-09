package in.nsti.patna.firstboot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentrepo;
	
	public String saveUser(Long id, String name, String age, String mail, String phone, MultipartFile photo) {
		try
		{
			String imgurl = "src/main/resources/static/photos";
			String imgname = System.currentTimeMillis()+photo.getOriginalFilename();
			Path path = Paths.get(imgurl+File.separator+imgname);
			Files.copy(photo.getInputStream(), path);
			Student st = new Student();
			st.setId(id);
			st.setName(name);
			st.setAge(age);
			st.setMail(mail);
			st.setPhone(phone);
			st.setPhoto(imgname);
			studentrepo.save(st);
			return "registraion done";		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return "registraion done";
		
	}
	
	public Iterable<Student> show(){
		return studentrepo.findAll();
	}

}
