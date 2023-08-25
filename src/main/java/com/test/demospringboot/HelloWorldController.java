package com.test.demospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String HelloWorld() {
        List<String> list = new ArrayList<String>();
        list.add("Skygrade");
        list.add("test");
        list.add("demo");
        for (String i: list){
            System.out.println(i);

        }
        return "skygrade";
    }
}
