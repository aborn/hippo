package com.github.aborn.hippo.hippoadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test/")
public class TestController {

    // http://127.0.0.1:8080/test/hello
    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello() {
        return "hello, hippo, This is admin web api.";
    }
}
