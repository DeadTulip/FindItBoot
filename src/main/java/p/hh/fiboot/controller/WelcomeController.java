package p.hh.fiboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import p.hh.fiboot.dto.WelcomeDto;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public WelcomeDto index() {
        WelcomeDto wd = new WelcomeDto();
        wd.setMessage("nihao");
        return wd;
    }
}
