package com.s4s.charity.candidatesvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/sayHello")
    public String sayHello() {

        log.info("within DemoController.sayHello");
        String msg = "Hello " + UUID.randomUUID().toString() + "!!! How are you?? I am from candidate-svc";
        log.info("msg :: {}", msg);
        return msg;
    }
}
