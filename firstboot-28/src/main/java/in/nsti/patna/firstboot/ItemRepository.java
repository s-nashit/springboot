package in.nsti.patna.firstboot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}