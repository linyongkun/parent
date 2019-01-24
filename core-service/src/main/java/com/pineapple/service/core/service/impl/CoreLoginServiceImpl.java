package com.pineapple.service.core.service.impl;

import com.pineapple.module.core.entity.CoreUser;
import com.pineapple.service.core.mapper.CoreUserMapper;
import com.pineapple.service.core.service.CoreLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.xml.ws.Action;

/**
 * module name :登陆逻辑
 * Created by lyk on 2019/1/22.
 */
@Service
public class CoreLoginServiceImpl implements CoreLoginService {

    @Autowired
    private CoreUserMapper coreUserMapper;

    @Override
    public boolean login(@Valid CoreUser coreUser) {
        CoreUser user = coreUserMapper.getCoreUserByAccount(coreUser.getAccount());
        if (user == null){
            //抛出异常
        }
        return false;
    }
}
