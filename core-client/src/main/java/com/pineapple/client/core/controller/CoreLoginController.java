package com.pineapple.client.core.controller;

import com.pineapple.base.core.controller.CoreController;
import com.pineapple.base.core.vo.ResultVO;
import com.pineapple.client.core.TestClient;
import com.pineapple.client.core.api.CoreLoginClient;
import com.pineapple.module.core.entity.CoreUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * module name : 登陆
 * Created by lyk on 2019/1/3.
 */
@RestController
@RequestMapping("login")
public class CoreLoginController extends CoreController {

    @Autowired
    private CoreLoginClient coreLoginClient;

    @PostMapping("login")
    // @ModelAttribute -可以从隐含对象中获取隐含的模型数据中获取对象，再将请求参数 –  绑定到对象中，再传入入参  -将方法入参对象添加到模型中 –
    public ResultVO login(@Valid @ModelAttribute CoreUser coreUser, @RequestParam String validataCode) {
        return coreLoginClient.login(coreUser, validataCode);
    }

    @PostMapping("test")
    // @ModelAttribute -可以从隐含对象中获取隐含的模型数据中获取对象，再将请求参数 –  绑定到对象中，再传入入参  -将方法入参对象添加到模型中 –
    public ResultVO test() {
        return coreLoginClient.test();
    }
}
