package com.pineapple.service.core.api;

import com.pineapple.base.core.api.AbstractCoreApi;
import com.pineapple.base.core.constant.CoreConstant;
import com.pineapple.base.core.constant.ResultVOConstant;
import com.pineapple.base.core.vo.ResultVO;
import com.pineapple.module.core.entity.CoreUser;
import com.pineapple.service.core.service.CoreLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * module name :登陆
 * Created by lyk on 2019/1/21.
 */

@Api(tags = "登陆管理")
@RestController
@RequestMapping("coreLogin")
public class CoreLoginApi extends AbstractCoreApi {

//    @Autowired
//    private CoreLoginService coreLoginService;

    @Autowired
    private StringRedisTemplate template;

    @PostMapping("login")
    @ApiOperation(value = "登录")
    // @ModelAttribute -可以从隐含对象中获取隐含的模型数据中获取对象，再将请求参数 –  绑定到对象中，再传入入参  -将方法入参对象添加到模型中 –
    public ResultVO login(@Valid @RequestBody CoreUser coreUser, @RequestParam String validataCode) {
        String sessionId = request.getSession().getId();
        String sessionCode = template.opsForValue().get(sessionId);
        if (!validataCode.equals(sessionCode)) {
            return new ResultVO(false, "验证码错误");
        }
//        coreLoginService.login(coreUser);
        return new ResultVO(true);
    }
}
