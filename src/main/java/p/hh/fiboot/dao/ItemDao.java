package p.hh.fiboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import p.hh.fiboot.domain.Item;
import p.hh.fiboot.domain.User;

import java.util.List;

public interface ItemDao extends JpaRepository<Item, Long> {
    List<Item> findAllByOwner(User user);
}
