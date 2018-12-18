package net.canway.dockertest.A;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eltons,  Date on 2018-12-11.
 */
@RestController
public class TestController {

    @GetMapping("/tt")
    public String get(){
        return "Hello Docker";
    }
}
