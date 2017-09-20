package p.hh.fiboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import p.hh.fiboot.domain.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);
}
