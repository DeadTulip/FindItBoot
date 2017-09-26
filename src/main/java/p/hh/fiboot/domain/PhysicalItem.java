package p.hh.fiboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("P")
@Getter @Setter @NoArgsConstructor
public class PhysicalItem extends Item {

    @OneToOne
    @JoinColumn(name = "picture")
    private DiskLocation picture;

}
