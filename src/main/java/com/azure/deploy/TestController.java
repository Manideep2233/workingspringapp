package com.azure.deploy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping("/v1")
public class TestController {
    @GetMapping("/list")
    public String list(){
        return "list!";
    }

    @GetMapping("/message")
    public String message(){
        return "Congrats ! your application deployed successfully in Azure Platform. !";
    }


}
