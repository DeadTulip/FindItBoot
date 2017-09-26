package p.hh.fiboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import p.hh.fiboot.domain.Team;
import p.hh.fiboot.domain.User;

import java.util.List;

/**
 * Created by Atos on 21-9-2017.
 */
public interface TeamDao extends JpaRepository<Team, Long> {
    List<Team> findAllByCreator(User user);
}
