package p.hh.fiboot.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("P")
public class PhysicalItem extends Item {

    @OneToOne
    @JoinColumn(name = "picture")
    private DiskLocation picture;

    public PhysicalItem() {
    }

    public DiskLocation getPicture() {
        return picture;
    }

    public void setPicture(DiskLocation picture) {
        this.picture = picture;
    }
}
