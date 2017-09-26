package p.hh.fiboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "team")
@Getter
@Setter
@NoArgsConstructor
public class Team extends BaseEntity {

    @Column(name = "teamname")
    private String teamName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator")
    private User creator;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "team_user",
            joinColumns = { @JoinColumn(name = "team_id", nullable = false) },
            inverseJoinColumns = { @JoinColumn(name = "user_id", nullable = false) }
    )
    private final Set<User> members = new HashSet<User>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "item_team",
            joinColumns = { @JoinColumn(name = "team_id", nullable = false) },
            inverseJoinColumns = { @JoinColumn(name = "item_id", nullable = false) }
    )
    private final Set<Item> items = new HashSet<Item>();
}
