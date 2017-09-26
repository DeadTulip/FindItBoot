package p.hh.fiboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "disk_location")
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
@NoArgsConstructor
public class DiskLocation extends Location {

    private static final long serialVersionUID = -7537532137366501041L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Column(name = "original_name")
    private String originalName;

    @Column(name = "on_disk_name")
    private String onDiskName;

}
