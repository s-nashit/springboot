package in.nsti.patna.firstboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository sR;
	
	public void saveS(Student student) {
		sR.save(student);
		
	}
	
	public List <Student> getUsers(){
		return sR.findAll();
	}
	
	public void deleteS(Long id) {
		sR.deleteById(id);
	}
	
	public Optional<Student> getUser(Long id){
		return sR.findById(id);
	}
	

}
