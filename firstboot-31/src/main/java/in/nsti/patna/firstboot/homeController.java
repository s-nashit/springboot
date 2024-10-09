package in.nsti.patna.firstboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
	
	@Autowired
	UserInterface uR;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute User user) {
		uR.save(user);
		return "redirect:/";
	}

}
