package com.pineapple.client.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * module name :
 * Created by lyk on 2018/12/24.
 */


@RestController
@RequestMapping("test1")
public class Test1 {

    @Autowired
    private TestClient testClient;

    @RequestMapping("test1")
    public String test1(String account, String password) {
        return testClient.test1();
    }
}