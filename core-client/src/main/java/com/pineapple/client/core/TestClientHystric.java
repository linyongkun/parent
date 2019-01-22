package com.pineapple.client.core;

import org.springframework.stereotype.Component;

/**
 * module name :
 * Created by lyk on 2018/12/25.
 */
@Component
public class TestClientHystric implements TestClient {
    @Override
    public String test1() {
        return "err";
    }
}
