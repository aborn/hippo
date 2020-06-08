package com.github.aborn.hippo.hippoapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test/")
public class TestController {

    // http://127.0.0.1:8080/test/hello
    @RequestMapping(value = "hello")
    @ResponseBody
    public Map hello() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String,String> map = new HashMap<>();
        map.put("hello", "Hippo");
        map.put("appkey", "hippo-api");
        map.put("desc", "这个应用是提供给C端或者SDK接口（包括restapi/rpc）等");
        map.put("timestamp", simpleDateFormat.format(new Date()));
        return map;
    }
}
