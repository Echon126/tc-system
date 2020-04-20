package com.tianta.tc.core.groovy;

import java.util.Map;

/**
 * @author ZKTT
 */
public interface IGroovyScriptEngine {
    /**
     * 功能描述：执行groovy代码无返回。
     *
     * @param script
     */
    void execute(String script);

    /**
     * 功能描述：执行groovy代码无返回。
     *
     * @param script 脚本
     * @param vars   变量
     */
    void execute(String script, Map<String, Object> vars);

    /**
     * 功能描述： 执行groovy代码返回布尔型。
     *
     * @param script
     * @return
     * @throws Exception
     */
    boolean executeBoolean(String script, Map<String, Object> vars);

    /**
     * 功能描述：执行脚本返回字符串数据。
     *
     * @param script
     * @return 字符串数据
     */
    String executeString(String script, Map<String, Object> vars);

    /**
     * 功能描述：执行脚本返回整形数据。
     *
     * @param script
     * @return 整形数据
     */
    int executeInt(String script, Map<String, Object> vars);

    /**
     * 功能描述：执行脚本返回浮点型数据。
     *
     * @param script
     * @return 浮点型数据
     */
    float executeFloat(String script, Map<String, Object> vars);

    /**
     * 功能描述：执行脚本返回对象数据。
     *
     * @param script
     * @return 对象数据
     */
    Object executeObject(String script, Map<String, Object> vars);

}