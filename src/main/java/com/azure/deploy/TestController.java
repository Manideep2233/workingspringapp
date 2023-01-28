package com.azure.deploy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping("/v1")
public class TestController {
    @GetMapping("/people")
    public List<String> list(){
        List<String> integers = new ArrayList<>();
        integers.add("Manideep");
        integers.add("Nani");
        integers.add("Abhi Ram");
        return integers;
    }

    @GetMapping("/message")
    public String message(){
        return "Congrats ! your application deployed successfully in Azure Platform. !";
    }


}
