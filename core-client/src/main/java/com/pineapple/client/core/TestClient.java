package com.pineapple.client.core;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * module name :
 * Created by lyk on 2018/12/24.
 */
@FeignClient(value="core-service",fallback = TestClientHystric.class)
public interface TestClient {

    @GetMapping("/test/test")
    public String test1();
}
