package p.hh.fiboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hh.fiboot.dao.UserRepository;
import p.hh.fiboot.domain.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }
}
