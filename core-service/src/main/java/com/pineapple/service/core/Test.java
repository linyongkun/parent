package com.pineapple.service.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * module name :
 * Created by lyk on 2018/12/24.
 */
@RestController
@RequestMapping("test")
public class Test {

    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
