package p.hh.fiboot.dto;


import p.hh.fiboot.domain.*;

import java.lang.reflect.Field;
import java.util.Date;

public class DomainUtil {

    static User createUser() {
        User user = new User();
        setEntityId(user, 123L);
        user.setUsername("myUserName");
        return user;
    }

    static Team createTeam(User creator) {
        Team team = new Team();
        setEntityId(team, 456L);
        team.setCreator(creator);
        team.setTeamName("myTeamName");
        return team;
    }

    static PhysicalItem createPhysicalItem(User user, PhysicalLocation physicalLocation) {
        PhysicalItem pi = new PhysicalItem();
        setEntityId(pi, 333L);
        pi.setOwner(user);
        pi.setLocation(physicalLocation);
        pi.setName("myPhysicalItemName");
        pi.setDateCreated(new Date());
        pi.setDateUpdated(new Date());
        pi.setEventStartTime(new Date());
        pi.setEventEndTime(new Date());
        pi.setInvolvedPeople("1,2,3");
        pi.setInvolvedPlaces("4,5,6");
        pi.setDescription("myItemDescription");
        return pi;
    }

    static PhysicalLocation createPhysicalLocation() {
        PhysicalLocation physicalLocation = new PhysicalLocation();
        setEntityId(physicalLocation, 222L);
        physicalLocation.setName("myRoom");
        physicalLocation.setDescription("This is my room.");
        return physicalLocation;
    }

    static void setEntityId(BaseEntity be, Long id) {
        try {
            Class clazz = be.getClass();
            while(clazz != BaseEntity.class) {
                clazz = clazz.getSuperclass();
            }
            Field idField = clazz.getDeclaredField("id");
            idField.setAccessible(true);
            idField.set(be, id);
        } catch (NoSuchFieldException nfe) {

        } catch (IllegalAccessException iae) {

        }
    }
}
