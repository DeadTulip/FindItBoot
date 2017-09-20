package p.hh.fiboot.dto;

import org.modelmapper.ModelMapper;
import p.hh.fiboot.domain.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDto {

    public static UserDto map(ModelMapper modelMapper, User user) {
        return modelMapper.map(user, UserDto.class);
    }

    public static List<UserDto> map(ModelMapper modelMapper, List<User> users) {
        List<UserDto> userDtos = users.stream()
                .map(user -> UserDto.map(modelMapper, user))
                .collect(Collectors.toList());
        return userDtos;
    }

    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
