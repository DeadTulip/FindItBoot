package p.hh.fiboot.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public abstract class ItemDto {

    protected Long itemId;
    protected UserDto owner;
    protected String name;
    protected Date dateCreated;
    protected Date dateUpdated;
    protected Date eventStartTime;
    protected Date eventEndTime;
    protected String involvedPeople;
    protected String involvedPlaces;
    protected String description;
}
