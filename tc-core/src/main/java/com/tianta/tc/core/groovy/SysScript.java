package com.tianta.tc.core.groovy;

import org.springframework.stereotype.Component;

/**
 * 系统脚本(常用的系统功能的脚本)
 *
 * @author ZKTT
 */
@Component
public class SysScript implements IScript {

    public String getCommand() {
        return "指令數據";
    }
}
