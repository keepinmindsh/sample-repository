package bong.lines.customannotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleAController {

    @GetMapping("/sample/a")
    public String getA(){
        return "A";
    }
}
