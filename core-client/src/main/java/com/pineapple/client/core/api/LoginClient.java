package com.pineapple.client.core.api;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * module name :
 * Created by lyk on 2019/1/7.
 */
public interface LoginClient {

    @PostMapping("login")
    boolean login();
}
