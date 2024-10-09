import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String> {

    // Query to get the maximum custom ID from the database
    @Query("SELECT MAX(u.customId) FROM User u")
    String findMaxCustomId();
}
