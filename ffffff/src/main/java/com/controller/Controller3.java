package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Auther WH
 * @Date 2020/4/18
 */
@RestController
@ConfigurationProperties(prefix = "person")
public class Controller3 {


    private String name;
    private String addr;

    @RequestMapping("/run3")
    public String run2(){
        return name + addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
