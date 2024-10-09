package in.nsti.patna.firstboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class homeController {
	
	@Autowired
	UserService uS;
	
	@Autowired
	UserRepo uR;
	
	@GetMapping("/")
	public String home(Model m) {
		List<User> user = uR.findAll();
		m.addAttribute("user", user);
		return "index";
	}
	
	@GetMapping("/add")
	public String add(Model m) {
		m.addAttribute("User", new User());
		return "add";
	}
	
	@PostMapping("/saveUser")
	public String saveU(@RequestParam String id, @RequestParam String name, @RequestParam String mail, @RequestParam String dob, @RequestParam MultipartFile file, Model model) {
		String msg = uS.reg(id, name, mail, dob, file);
		model.addAttribute(msg);
		return "redirect:/";
		
	}

}
