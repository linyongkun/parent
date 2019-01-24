package com.pineapple.service.core.mapper;

import com.pineapple.module.core.entity.CoreUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CoreUserMapper {

    @Select("select * from core_user where account = #{value}")
    CoreUser getCoreUserByAccount(String account);
}