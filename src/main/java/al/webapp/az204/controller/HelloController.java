package al.webapp.az204.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Pershendetje nga Azure App Service, &#10084; ime! <br> Staging Environment";
    }

}