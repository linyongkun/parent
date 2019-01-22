package com.pineapple.service.core.api;

import com.pineapple.base.core.api.AbstractCoreApi;
import com.pineapple.base.core.constant.CoreConstant;
import com.pineapple.base.core.constant.ResultVOConstant;
import com.pineapple.base.core.vo.ResultVO;
import com.pineapple.module.core.entity.CoreUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * module name :登陆
 * Created by lyk on 2019/1/21.
 */
@RestController
@RequestMapping("login")
public class LoginApi extends AbstractCoreApi {

    @PostMapping("login")
    @ApiOperation(value = "登录")
    // @ModelAttribute -可以从隐含对象中获取隐含的模型数据中获取对象，再将请求参数 –  绑定到对象中，再传入入参  -将方法入参对象添加到模型中 –
    public ResultVO login(@Valid @ModelAttribute CoreUser coreUser, @RequestParam String validataCode) {
        return new ResultVO(true);
    }
}
