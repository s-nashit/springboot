package in.nsti.patna.firstboot;




import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;    }
    public Person savePerson(Person person) {
        // Custom ID generation logic: "adit22ap01"
        person.setId(generateCustomId());
        return personRepository.save(person);    }
    private String generateCustomId() {
        // You can customize this logic
        return "ADIT01" + UUID.randomUUID().toString().substring(0, 6);    }
}

