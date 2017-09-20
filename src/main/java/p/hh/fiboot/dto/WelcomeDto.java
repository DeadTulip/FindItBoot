package p.hh.fiboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Atos on 20-9-2017.
 */
public class WelcomeDto extends ResourceSupport {

    private String message;

    public WelcomeDto(@JsonProperty("message") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
