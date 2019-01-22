package com.pineapple.base.core.api;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * module name :
 * Created by lyk on 2019/1/21.
 */
public abstract class AbstractCoreApi implements CoreApi {
    @Resource
    protected HttpServletRequest request;

//    protected ModelMap model;

    protected HttpServletResponse response;

    /**
     * 设置response
     *
     * @param response
     */
    // Spring MVC  在调用目标处理方法前，会先逐个调用在方法级上标注了 @ModelAttribute 的方法
    @ModelAttribute
    private final void initResponse(HttpServletResponse response) {
        this.response = response;
    }
}
