package com.pineapple.client.core.client.hystric;

import com.pineapple.base.core.vo.ResultVO;
import com.pineapple.client.core.client.CoreLoginClient;
import com.pineapple.module.core.entity.CoreUser;
import org.springframework.stereotype.Component;

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
}
