package com.tianta.tc.web.controller;

import com.tianta.tc.core.groovy.IGroovyScriptEngine;
import com.tianta.tc.db.entity.TcCommandData;
import com.tianta.tc.db.mapper.TcCommandDataMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZKTT
 */
@RestController
public class GroovyController {

    @Resource
    private IGroovyScriptEngine groovyScriptEngine;

    @Resource
    private TcCommandDataMapper tcCommandDataMapper;

    @GetMapping("/groovy")
    public String executeGroovy() {
        String script = "sysScript.getCommand()";
        Map<String, Object> map = new HashMap<String, Object>();
        String obj = groovyScriptEngine.executeString(script, map);
        return obj;
    }


    @GetMapping("/tc/command")
    public List<TcCommandData> queryTcCommandDataList() {
        return this.tcCommandDataMapper.selectList(null);
    }
}
