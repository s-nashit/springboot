package in.nsti.patna.firstboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
	public class PersonController {

	@Autowired
    private PersonRepository userRepository;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Person());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute Person user) {
        userRepository.save(user);
        return "redirect:/register?success";
    }
	}


