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
    private studentRepository u;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("user", new Student());
        return "index";
    }

    @GetMapping("/register")
    public String registerUser(@ModelAttribute Student user) {
        u.save(user);
        return "register";
    }

}
