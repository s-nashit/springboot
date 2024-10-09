package in.nsti.patna.firstboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
	
	@Autowired
	private StudentService sS;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("data", sS.getUsers());
		return "index";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		Student s = new Student();
		model.addAttribute("student", s);
		return "register";
	}
	
	@GetMapping("/delete/{id}")
	public String del(@PathVariable(value="id") long id) {
		sS.deleteS(id);
		return "redirect:/";
	}
	
	@PostMapping("/saveS")
	public String saveS(@ModelAttribute("student") Student student) {
		sS.saveS(student);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable(value="id") long id, Model model){
		Optional <Student> s = sS.getUser(id);
		model.addAttribute("s", s);
		return "update_user";
	} {
		
	}

}
