package com.pineapple.client.core.api;

import com.pineapple.base.core.vo.ResultVO;
import com.pineapple.client.core.api.hystric.CoreLoginClientHystric;
import com.pineapple.module.core.entity.CoreUser;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * module name :
 * Created by lyk on 2019/1/7.
 */
@FeignClient(value = "core-service", fallback = CoreLoginClientHystric.class)
public interface CoreLoginClient {

    @PostMapping(value = "/login/login", consumes = "application/json")
    ResultVO login(@RequestBody CoreUser coreUser, @RequestParam("validataCode") String validataCode);

    @PostMapping(value = "/login/test", consumes = "application/json")
    ResultVO test();
}
