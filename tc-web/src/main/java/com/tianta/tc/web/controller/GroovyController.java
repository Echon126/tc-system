package com.tianta.tc.web.controller;

import com.tianta.tc.core.groovy.IGroovyScriptEngine;
import com.tianta.tc.db.entity.TcCommandData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZKTT
 */
@RestController
public class GroovyController {

    @Resource
    private IGroovyScriptEngine groovyScriptEngine;


    @GetMapping("/groovy")
    public String executeGroovy() {
        String script = "sysScript.getCommand()";
        Map<String, Object> map = new HashMap<String, Object>();
        String obj = groovyScriptEngine.executeString(script, map);
        return obj;
    }


    @GetMapping("/tc/command/{script}")
    public TcCommandData queryTcCommandDataList(@PathVariable String script) {
        //String script = "sysScript.getCommand('X221')";
        Map<String, Object> map = new HashMap<String, Object>();
        TcCommandData o = (TcCommandData) groovyScriptEngine.executeObject(script, map);
        return o;
    }
}
