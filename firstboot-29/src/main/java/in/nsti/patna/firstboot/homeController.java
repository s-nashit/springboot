package in.nsti.patna.firstboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
	@Autowired
	StudentRepository SR;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/add")
	public String addU(Model model) {
		model.addAttribute("student", new Student());
		return "add";
	}
	
	@PostMapping("/add")
	public String addM(@ModelAttribute Student st) {
		SR.save(st);
		return "redirect:/";
	}


}
