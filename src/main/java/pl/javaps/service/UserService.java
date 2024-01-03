package pl.javaps.service;

import org.springframework.stereotype.Service;
import pl.javaps.repository.UserRepository;
import pl.javaps.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository usersRepository) {
        this.userRepository = usersRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> getActiveUsers() {
        return userRepository.findAll().stream()
                .filter(user -> user.isActive())
                .collect(Collectors.toList());
    }

    public List<User> getActiveSuperUsers() {
        return userRepository.findAll().stream()
                .filter(user -> user.isActive())
                .filter(user -> user.isSuperuser())
                .collect(Collectors.toList());
    }
}
