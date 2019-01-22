package com.pineapple.client.core.api.hystric;

import com.pineapple.client.core.api.LoginClient;
import org.springframework.stereotype.Component;

/**
 * module name :
 * Created by lyk on 2019/1/7.
 */
@Component
public class LoginClientHystric implements LoginClient {
    @Override
    public boolean login() {
        return false;
    }
}
