package com.tianta.tc.core.script;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tianta.tc.core.groovy.IScript;
import com.tianta.tc.db.entity.TcCommandData;
import com.tianta.tc.db.repository.TcCommandDataService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 系统脚本(常用的系统功能的脚本)
 *
 * @author ZKTT
 */
@Component
public class SysScript implements IScript {
    @Resource
    private TcCommandDataService tcCommandDataService;

    /**
     * 功能描述：根据指令代号查询指令数据
     *
     * @param commandCode 指令代号
     * @return TcCommandData
     */
    public TcCommandData getCommand(String commandCode) {
        LambdaQueryWrapper<TcCommandData> queryWrapper = new LambdaQueryWrapper<TcCommandData>()
                .eq(TcCommandData::getCommandCode, commandCode)
                .eq(TcCommandData::getStatus, 1);
        return this.tcCommandDataService.getOne(queryWrapper);
    }

    /**
     * 功能描述：遥控单个指令发送
     *
     * @param id 指令标识
     * @return boolean
     */
    public boolean sendTcCommand(Integer id) {
        return false;
    }

    /**
     * 功能描述：指令序列
     *
     * @param seqCode 指令序列代号
     * @return boolean
     */
    public boolean sendTcSequence(String seqCode) {
        return false;
    }
}
