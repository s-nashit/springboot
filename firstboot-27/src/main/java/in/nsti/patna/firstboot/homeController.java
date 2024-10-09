package in.nsti.patna.firstboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class homeController {
	
	@Autowired
	StudentService stS;
	
	@GetMapping("/")
	public String home() {
		return "index";	}
	
	@PostMapping("/upload")
	public String upload(@RequestParam Long id, @RequestParam String name, @RequestParam String age, @RequestParam String mail, @RequestParam String phone, @RequestParam MultipartFile photo, Model model) {
		String message = stS.saveUser(id, name, age, mail, phone, photo);
		model.addAttribute("data", message);
		return "index";}
	
	@GetMapping("/show")
	public String show(Model model) {
		model.addAttribute("data", stS.show());
		return "show";
	}

}
