package p.hh.fiboot.dto;

import lombok.*;

@Data
public class PhysicalLocationDto {

    @Setter(AccessLevel.NONE)
    private String type = "PhysicalLocation";
    private Long locationId;
    private String name;
    private String description;
}
