package in.nsti.patna.firstboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import ch.qos.logback.core.model.Model;

@Controller
public class homeController {
	
	@Autowired
	private studentRepository std;
	
	@GetMapping("/")
	public String home(Model m1) {
		m1.addAttribute("s1", new Student());
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Student s, Model m) {
		System.out.println(s);
		System.out.println("welcome "+s.getName());
		m.addAttribute("key", s.getName());
		std.save(s);
		return "register";
	}
	
	@GetMapping("/show")
	public String show(Model m) {
		List<Student> student = std.findAll();
		m.addAttribute("s", student);
		return "show";
	}

}
