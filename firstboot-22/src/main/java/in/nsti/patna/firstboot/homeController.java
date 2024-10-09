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
	UserService userService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("data", userService.getUsers());
		return "index";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(value="id")long id) {
		userService.deleteUser(id);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable(value="id")long id, Model model) {
		Optional<User> user = userService.getUserById(id);
		model.addAttribute("u", user);
		return "update_user";
	}

	
}
