package com.pineapple.service.core.service;

import com.pineapple.module.core.entity.CoreUser;

import javax.validation.Valid;

/**
 * module name :
 * Created by lyk on 2019/1/22.
 */
public interface CoreLoginService {
    boolean login(@Valid CoreUser coreUser);
}
