package p.hh.fiboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "physical_location")
@PrimaryKeyJoinColumn(name = "id")
public class PhysicalLocation extends Location {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public PhysicalLocation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
