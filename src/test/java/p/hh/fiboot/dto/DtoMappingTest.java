package p.hh.fiboot.dto;

import org.hibernate.mapping.Collection;
import org.junit.Test;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import p.hh.fiboot.domain.PhysicalItem;
import p.hh.fiboot.domain.PhysicalLocation;
import p.hh.fiboot.domain.Team;
import p.hh.fiboot.domain.User;


public class DtoMappingTest {

    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void testUserDtoMapping() {
        User user = DomainUtil.createUser();
        UserDto userDto = modelMapper.map(user, UserDto.class);
        System.out.println(userDto);
        MappingUtil.verifyUserMapping(user, userDto);
    }

    @Test
    public void testTeamDtoMapping() {
        User user = DomainUtil.createUser();
        Team team = DomainUtil.createTeam(user);

        TeamDto teamDto = modelMapper.map(team, TeamDto.class);
        System.out.println(teamDto);
        MappingUtil.verifyTeamMapping(team, teamDto);
    }

    @Test
    public void testPhysicalLocationDtoMapping() {
        PhysicalLocation pl = DomainUtil.createPhysicalLocation();
        PhysicalLocationDto plDto = modelMapper.map(pl, PhysicalLocationDto.class);
        System.out.println(plDto);
        MappingUtil.verifyPhysicalLocation(pl, plDto);
    }

    @Test
    public void testItemDtoMappingWithPhysicalItem() {
        User user = DomainUtil.createUser();
        PhysicalLocation pl = DomainUtil.createPhysicalLocation();
        PhysicalItem pi = DomainUtil.createPhysicalItem(user, pl);

        PhysicalItemDto itemDto = modelMapper.map(pi, PhysicalItemDto.class);
        PhysicalLocationDto physicalLocationDto = modelMapper.map(pl, PhysicalLocationDto.class);
        itemDto.setLocation(physicalLocationDto);

        System.out.println(itemDto);
        MappingUtil.verifyPhysicalItemMapping(pi, itemDto);
    }


}
