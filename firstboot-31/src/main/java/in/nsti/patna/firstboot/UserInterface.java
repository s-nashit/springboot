package in.nsti.patna.firstboot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInterface extends MongoRepository<User, String>{

}
