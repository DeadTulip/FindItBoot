package p.hh.fiboot.dto;

import p.hh.fiboot.domain.*;

import static org.junit.Assert.assertEquals;


public class MappingUtil {

    static void verifyUserMapping(User user, UserDto userDto) {
        assertEquals(user.getId(), userDto.getUserId());
        assertEquals(user.getUsername(), userDto.getUsername());
    }

    static void verifyTeamMapping(Team team, TeamDto teamDto) {
        assertEquals(team.getId(), teamDto.getTeamId());
        assertEquals(team.getTeamName(), teamDto.getTeamName());
        verifyUserMapping(team.getCreator(), teamDto.getCreator());
    }

    static void verifyItemMapping(Item item, ItemDto itemDto) {
        assertEquals(item.getId(), itemDto.getItemId());
        verifyUserMapping(item.getOwner(), itemDto.getOwner());
        assertEquals(item.getName(), itemDto.getName());
        assertEquals(item.getDateCreated(), itemDto.getDateCreated());
        assertEquals(item.getDateUpdated(), itemDto.getDateUpdated());
        assertEquals(item.getEventStartTime(), itemDto.getEventStartTime());
        assertEquals(item.getEventEndTime(), itemDto.getEventEndTime());
        assertEquals(item.getInvolvedPeople(), itemDto.getInvolvedPeople());
        assertEquals(item.getInvolvedPlaces(), itemDto.getInvolvedPlaces());
        assertEquals(item.getDescription(), itemDto.getDescription());
    }

    static void verifyDiskItemMapping(DiskItem di, DiskItemDto diDto) {
        assertEquals("DiskItem", diDto.getItemType());
        verifyItemMapping(di, diDto);
        assertEquals(di.getFileSize(), diDto.getFileSize());
        assertEquals(di.getFileType(), diDto.getFileType());
    }

    static void verifyPhysicalItemMapping(PhysicalItem pi, PhysicalItemDto piDto) {
        assertEquals("PhysicalItem", piDto.getItemType());
        verifyItemMapping(pi, piDto);
        verifyPhysicalLocation((PhysicalLocation) pi.getLocation(), piDto.getLocation());
    }

    static void verifyPhysicalLocation(PhysicalLocation pl, PhysicalLocationDto plDto) {
        assertEquals("PhysicalLocation", plDto.getType());
        assertEquals(pl.getName(), plDto.getName());
        assertEquals(pl.getDescription(), plDto.getDescription());
    }
}
