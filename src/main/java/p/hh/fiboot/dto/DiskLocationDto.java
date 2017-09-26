package p.hh.fiboot.dto;

import lombok.*;

@Data
public class DiskLocationDto {

    @Setter(AccessLevel.NONE)
    private String type = "DiskLocation";
    private Long locationId;
    private String onDiskName;
    private String originalName;

}
