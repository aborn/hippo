package com.github.aborn.hippo.hippoadmin.controller;

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
        map.put("desc", "这里提供给运营管理后台使用的接口等");
        map.put("appkey", "hippo-admin");
        map.put("timestamp", simpleDateFormat.format(new Date()));
        return map;
    }
}
