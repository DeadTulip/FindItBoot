package p.hh.fiboot.dto;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class PhysicalItemDto extends ItemDto {

    @Setter(AccessLevel.NONE)
    private String itemType = "PhysicalItem";
    private PhysicalLocationDto location;
}
