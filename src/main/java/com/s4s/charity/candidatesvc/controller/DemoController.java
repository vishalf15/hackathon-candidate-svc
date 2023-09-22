package com.s4s.charity.candidatesvc.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.UUID;

@RestController

public class DemoController {
	
	private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/sayHello")
    public String sayHello() {

        log.info("within DemoController.sayHello");
        String msg = "Hello " + UUID.randomUUID().toString() + "!!! How are you?? I am from candidate-svc";
        log.info("msg :: {}", msg);
        return msg;
    }
}
