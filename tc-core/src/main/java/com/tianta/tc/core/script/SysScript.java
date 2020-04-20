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

    public TcCommandData getCommand(String commandCode) {
        LambdaQueryWrapper<TcCommandData> queryWrapper = new LambdaQueryWrapper<TcCommandData>()
                .eq(TcCommandData::getCommandCode, commandCode)
                .eq(TcCommandData::getStatus, 1);
        TcCommandData one = this.tcCommandDataService.getOne(queryWrapper);

        return one;
    }
}
