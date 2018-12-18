package net.canway.dockertest.A;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eltons,  Date on 2018-12-11.
 */
@RestController
public class TestController2 {

    @GetMapping("/")
    public String getget(){
        return "Hrwaerjqk;lflkjsadfas;fsadfasf";
    }
}
