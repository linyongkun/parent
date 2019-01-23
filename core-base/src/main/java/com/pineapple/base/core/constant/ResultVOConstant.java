package com.pineapple.base.core.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * module name :通用返回对象错误
 * Created by lyk on 2019/1/21.
 */
public class ResultVOConstant {

    public static final String CUSTOM = "custom";

    public static final String CODE_KEY = "code";
    public static final String DESC_KEY = "desc";

    public static final String MODULE_NAME = "BASE";

    public static final String POSITION_TYPE_PARAM = "PARAM";

    public static final String ERR_TYPE_VALID = "VALID";//校验错误
    public static final String ERR_TYPE_ERR = "ERR";//校验错误
    /**
     * code 定义规则
     * 模块名+错误位置+错误类型
     * service中校验异常    2开头
     * service中运行时异常  3开头
     * 自定义类常亮异常     4开头
     */
    /**
     * 必要参数缺失
     */
    private static final String BASE_PARAM_NULL_CODE = MODULE_NAME + CoreConstant.UNDERLINE +
            POSITION_TYPE_PARAM + CoreConstant.UNDERLINE +
            ERR_TYPE_VALID;
    private static final String BASE_PARAM_NULL_DESC = "必要参数缺失";
    public static Map<String, Object> PARAM_NULL = new HashMap<String, Object>();

    /**
     * 参数错误
     */
    private static final String BASE_PARAM_ERR_CODE = MODULE_NAME + CoreConstant.UNDERLINE +
            POSITION_TYPE_PARAM + CoreConstant.UNDERLINE +
            ERR_TYPE_ERR;
    private static final String BASE_PARAM_ERR_DESC = "参数错误";
    public static Map<String, Object> PARAM_ERR = new HashMap<String, Object>();

    static {
        // 必要参数缺失
        PARAM_NULL.put(CODE_KEY, BASE_PARAM_NULL_CODE);
        PARAM_NULL.put(DESC_KEY, BASE_PARAM_NULL_DESC);

        // 参数错误
        PARAM_ERR.put(CODE_KEY, BASE_PARAM_ERR_CODE);
        PARAM_ERR.put(DESC_KEY, BASE_PARAM_ERR_DESC);
    }
}
