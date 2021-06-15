package com.lk.demo5.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedHashMap;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public String doPost(@RequestBody Object data, HttpServletRequest request) throws IOException {
        LinkedHashMap linkedHashMap = (LinkedHashMap) data;
        System.out.println(linkedHashMap.get("mobileNumber"));
        System.out.println(linkedHashMap.get("code"));

        return "success";
    }
}