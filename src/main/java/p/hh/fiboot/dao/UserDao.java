package p.hh.fiboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import p.hh.fiboot.domain.Team;
import p.hh.fiboot.domain.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);

    @Query("SELECT t from Team t where :user IN (t.members)")
    List<Team> findAllAccessibleTeamsByUser(@Param("user") User user);
}
