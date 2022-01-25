package bong.lines.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/helloworld")
    public Object helloWorld(){
        return "Hello World";
    }
}
