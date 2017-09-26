package p.hh.fiboot.domain;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Version
    @Column(name = "version", nullable = false)
    @Getter
    private Long version;

}
