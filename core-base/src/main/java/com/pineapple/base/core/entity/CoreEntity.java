package com.pineapple.base.core.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * module name :冗余字段
 * Created by lyk on 2019/1/7.
 */
//标识的类表示其不能映射到数据库表，因为其不是一个完整的实体类，但是它所拥有的属性能够隐射在其子类对用的数据库表中
@MappedSuperclass
//是将父类和其所有的子类集合在一块，存在一张表中，并创建一个新的字段来判断对象的类型。
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class CoreEntity implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private String id;

    /**
     * 创建人
     */
    @Column(name = "create_user", nullable = false, length = 32, updatable = false)
    private String createUser;

    /**
     * 创建日期
     */
    @Column(name = "create_date", nullable = false, columnDefinition = "DATE", updatable = false)
    private Date createDate;

    /**
     * 修改人
     */
    @Column(name = "update_user", nullable = true, length = 32)
    private String updateUser;

    /**
     * 修改日期
     */
    @Column(name = "update_date", nullable = true, columnDefinition = "DATE")
    private Date updateDate;

    /**
     * 版本
     */
    @Column(name = "version", nullable = false, length = 9)
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
