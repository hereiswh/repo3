package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Auther WH
 * @Date 2020/4/18
 */
@RestController
public class Controller1 {

    @RequestMapping("/run1")
    public String run1(){

        return "whzuibbbs";
    }
}
