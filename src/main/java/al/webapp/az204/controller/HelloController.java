package al.webapp.az204.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {

        log.info("Hit the endpoint!");

        return "Pershendetje nga Azure App Service, &#10084; ime!";
    }

}