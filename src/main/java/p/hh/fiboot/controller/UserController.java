package p.hh.fiboot.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import p.hh.fiboot.domain.User;
import p.hh.fiboot.dto.UserDto;
import p.hh.fiboot.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/all")
    public List<UserDto> listAllUser() {
        List<User> users = userService.listAllUsers();
        return UserDto.map(modelMapper, users);
    }

}
