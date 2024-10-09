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
	Studentservice uS;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/upload")
	public String upload(@RequestParam String id, @RequestParam String name, @RequestParam String mail,@RequestParam String city, @RequestParam MultipartFile file, Model m) {
		
		String msg = uS.saveSt(id, name, mail, city, file);
		m.addAttribute("msg", msg);
		
		return "redirect:/";
	}
	
	@GetMapping("/show")
	public String show(Model m) {
		m.addAttribute("data", uS.show());
		return "show";
	}

}
