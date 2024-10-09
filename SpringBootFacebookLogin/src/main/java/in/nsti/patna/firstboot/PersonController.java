package in.nsti.patna.firstboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }



    // Web page to show the form for a new person
    @GetMapping("/")
    public String createPersonForm(Model model) {
        model.addAttribute("person", new Person());
        return "add-person";
    }

    // Handling form submission for new person
    @PostMapping("/persons")
    public String savePerson(@ModelAttribute("person") Person person) {
        personService.savePerson(person);
        return "add-person";
    }


   
}