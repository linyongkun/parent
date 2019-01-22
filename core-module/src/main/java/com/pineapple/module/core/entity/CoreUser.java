package com.pineapple.module.core.entity;

import com.pineapple.base.core.entity.CoreEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * module name :用户
 * Created by lyk on 2019/1/21.
 */
@Entity
@Table(
        name = "core_user",
        indexes = {
                @Index(columnList = "name"),
                @Index(columnList = "create_date"), @Index(columnList = "create_user"),
                @Index(columnList = "update_date"), @Index(columnList = "update_user")
        })
public class CoreUser extends CoreEntity {

    @Column(name = "user_code", unique = true, nullable = false, length = 32)
    private String userCode;

    /**
     * 部门code
     */
    @Column(name = "org_code", nullable = false, length = 64)
    private String orgCode;

    /**
     * 姓名
     */
    @Column(name = "name", nullable = false, length = 32)
    private String name;

    /**
     * 账号
     */
    @NotBlank
    @Column(name = "account", unique = true, nullable = false, length = 32)
    private String account;

    /**
     * 密码
     */
    @NotBlank
    @Column(name = "password", nullable = false, length = 32)
    private String password;


    /**
     * 状态
     */
    @Column(name = "status", nullable = false, length = 2)
    private Integer status;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}