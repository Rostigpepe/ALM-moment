package se.robinsgalenskaper.alm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloALMController extends BasicController{

    @GetMapping("/hello")
    public String helloALM(){
        return "Hello ALM";
    }

    @GetMapping("/testForProtect")
    public String testForProtect(){
        return "testForProtect again";
    }

}
