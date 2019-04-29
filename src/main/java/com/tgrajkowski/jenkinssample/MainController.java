package com.tgrajkowski.jenkinssample;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MainController {

    @RequestMapping(value = "/logic")
    public String logic() {

        return "Logic logic logic12";
    }
}
