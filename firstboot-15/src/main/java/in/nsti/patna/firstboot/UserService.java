package in.nsti.patna.firstboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);}

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);}
}
