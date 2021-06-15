package com.lk.demo5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/failure")
public class FailureController {
    @RequestMapping(method = RequestMethod.GET)
    public String doGet() throws IOException {
        System.out.println("failure");

        return "failure page";
    }
}
