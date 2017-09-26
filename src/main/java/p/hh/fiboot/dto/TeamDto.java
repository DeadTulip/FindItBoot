package p.hh.fiboot.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class TeamDto {
    private Long teamId;
    private String teamName;
    private UserDto creator;
}
