package in.nsti.patna.firstboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class homeController {
	@GetMapping("/")
	public String home(HttpServletRequest req) {
		return "index page: " + req.getSession().getId();
	}

}
