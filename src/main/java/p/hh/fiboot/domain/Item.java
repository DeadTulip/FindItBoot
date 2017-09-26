package p.hh.fiboot.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "item")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "item_type", discriminatorType = DiscriminatorType.STRING)
@Getter @Setter
public abstract class Item extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "name")
    private String name;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "date_updated")
    private Date dateUpdated;

    @Column(name = "event_start_time")
    private Date eventStartTime;

    @Column(name = "event_end_time")
    private Date eventEndTime;

    @Column(name = "people")
    private String involvedPeople;

    @Column(name = "places")
    private String involvedPlaces;

    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "team_item",
            joinColumns = { @JoinColumn(name = "item_id", nullable = false) },
            inverseJoinColumns = { @JoinColumn(name = "team_id", nullable = false) }
    )
    private final Set<Team> sharedTeams = new HashSet<Team>();

}
