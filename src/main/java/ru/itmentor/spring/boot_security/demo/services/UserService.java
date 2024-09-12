package ru.itmentor.spring.boot_security.demo.services;



import org.springframework.security.core.userdetails.UserDetailsService;
import ru.itmentor.spring.boot_security.demo.dto.UserDTO;
import ru.itmentor.spring.boot_security.demo.dto.UserResponceDTO;
import ru.itmentor.spring.boot_security.demo.models.User;
import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> findAll();
    User findById(Long id);
    User findByName(String name);
    void save(User user);
    boolean delete(Long id);
    void updateUser(Long id, User user);
    void register(User user);
    User updateUser(User updatedUser);
    UserResponceDTO getUserDTOById(Long id);
    void updateUserFromDTO(Long id, UserDTO userDTO);
}