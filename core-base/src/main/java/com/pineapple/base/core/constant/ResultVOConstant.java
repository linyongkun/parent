package com.pineapple.base.core.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * module name :通用返回对象错误
 * Created by lyk on 2019/1/21.
 */
public class ResultVOConstant {

    /**
     * 必要参数缺失
     */
    private static final Integer PARAM_NULL_CODE = 101;
    private static final String PARAM_NULL_DESC = "必要参数缺失";
    public static Map<String, Object> PARAM_NULL = new HashMap<String, Object>();

    /**
     * 参数错误
     */
    private static final Integer PARAM_ERR_CODE = 201;
    private static final String PARAM_ERR_DESC = "参数错误";
    public static Map<String, Object> PARAM_ERR = new HashMap<String, Object>();

    static {
        // 必要参数缺失
        PARAM_NULL.put("code", PARAM_NULL_CODE);
        PARAM_NULL.put("desc", PARAM_NULL_DESC);

        // 参数错误
        PARAM_ERR.put("code", PARAM_ERR_CODE);
        PARAM_ERR.put("desc", PARAM_ERR_DESC);
    }
}
