package com.pineapple.client.core.api.hystric;

import com.pineapple.base.core.vo.ResultVO;
import com.pineapple.client.core.api.CoreLoginClient;
import com.pineapple.module.core.entity.CoreUser;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * module name :
 * Created by lyk on 2019/1/7.
 */
@Component
public class CoreLoginClientHystric implements CoreLoginClient {
    @Override
    public ResultVO login(CoreUser coreUser, String validataCode) {
        return new ResultVO(false);
    }

    @Override
    public ResultVO test() {
        return null;
    }

}
