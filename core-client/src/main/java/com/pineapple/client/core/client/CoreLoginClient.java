package com.pineapple.client.core.client;

import com.pineapple.base.core.vo.ResultVO;
import com.pineapple.client.core.client.hystric.CoreLoginClientHystric;
import com.pineapple.module.core.entity.CoreUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * module name :
 * Created by lyk on 2019/1/7.
 */
@FeignClient(value = "core-service", fallback = CoreLoginClientHystric.class)
public interface CoreLoginClient {

    @PostMapping(value = "/coreLogin/login", consumes = "application/json")
    ResultVO login(@RequestBody CoreUser coreUser, @RequestParam("validataCode") String validataCode);
}
