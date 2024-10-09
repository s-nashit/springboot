package in.nsti.patna.firstboot;

public interface UserService {
    void save(User user);
    User findByEmail(String email);
}