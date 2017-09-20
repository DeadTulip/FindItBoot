package p.hh.fiboot.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import p.hh.fiboot.dto.WelcomeDto;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public HttpEntity<WelcomeDto> index() {
        WelcomeDto wd = new WelcomeDto("ni hao!");
        wd.add(linkTo(methodOn(WelcomeController.class).index()).withSelfRel());
        return new ResponseEntity<WelcomeDto>(wd, HttpStatus.OK);
    }
}
