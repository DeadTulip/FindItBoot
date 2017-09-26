package p.hh.fiboot.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import p.hh.fiboot.domain.Item;
import p.hh.fiboot.domain.Team;
import p.hh.fiboot.domain.User;
import p.hh.fiboot.dto.ItemDto;
import p.hh.fiboot.dto.TeamDto;
import p.hh.fiboot.dto.UserDto;
import p.hh.fiboot.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{userId}")
    public UserDto getUser(@PathVariable Long userId) {
        User user = userService.findById(userId);
        return modelMapper.map(user, UserDto.class);
    }

    @GetMapping(value = "/{userId}/createdItems")
    public ItemDto[] createdItems(@PathVariable Long userId) {
        User user = userService.findById(userId);
        List<Item> items = userService.findAllCreatedItemsByUser(user);
        return items.stream()
                .map(it -> modelMapper.map(it, ItemDto.class))
                .toArray(ItemDto[]::new);
    }

    @GetMapping(value = "/{userId}/createdTeams")
    public TeamDto[] createdTeams(@PathVariable Long userId) {
        User user = userService.findById(userId);
        List<Team> teams = userService.findAllCreatedTeamsByUser(user);
        return teams.stream()
                .map(it -> modelMapper.map(it, TeamDto.class))
                .toArray(TeamDto[]::new);
    }

    @GetMapping(value = "/{userId}/accessibleTeams")
    public TeamDto[] accessibleTeams(@PathVariable Long userId) {
        User user = userService.findById(userId);
        List<Team> teams = userService.findAllAccessibleTeamsByUser(user);
        return teams.stream()
                .map(it -> modelMapper.map(it, TeamDto.class))
                .toArray(TeamDto[]::new);
    }

}
