package p.hh.fiboot.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity {

    private static final long serialVersionUID = -3512521164157856626L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "team_user",
            joinColumns = { @JoinColumn(name = "user_id", nullable = false) },
            inverseJoinColumns = { @JoinColumn(name = "team_id", nullable = false) }
    )
    @Setter(AccessLevel.NONE)
    private final Set<Team> teams = new HashSet<Team>();

}
