package p.hh.fiboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hh.fiboot.dao.ItemDao;
import p.hh.fiboot.dao.TeamDao;
import p.hh.fiboot.dao.UserDao;
import p.hh.fiboot.domain.Item;
import p.hh.fiboot.domain.Team;
import p.hh.fiboot.domain.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    TeamDao teamDao;

    public User findById(Long userId) {
        return userDao.findOne(userId);
    }

    public List<Item> findAllCreatedItemsByUser(User user) {
        return itemDao.findAllByOwner(user);
    }

    public List<Team> findAllCreatedTeamsByUser(User user) {
        return teamDao.findAllByCreator(user);
    }

    public List<Team> findAllAccessibleTeamsByUser(User user) {
        return userDao.findAllAccessibleTeamsByUser(user);
    }
}
