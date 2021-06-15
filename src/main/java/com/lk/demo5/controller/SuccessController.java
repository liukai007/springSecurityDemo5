package com.lk.demo5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/success")
public class SuccessController {
    @RequestMapping(method = RequestMethod.GET)
    public String doGet() throws IOException {
        System.out.println("success");

        return "success page";
    }
}
