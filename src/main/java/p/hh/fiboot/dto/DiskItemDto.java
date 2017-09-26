package p.hh.fiboot.dto;

import lombok.*;

@Getter
@Setter
@ToString(callSuper=true)
public class DiskItemDto extends ItemDto {

    @Setter(AccessLevel.NONE)
    private String itemType = "DiskItem";
    private String fileType;
    private Long fileSize;
    private DiskLocationDto location;

}
