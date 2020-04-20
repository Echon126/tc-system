package com.tianta.tc.web.controller;

import com.tianta.tc.core.groovy.IGroovyScriptEngine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZKTT
 */
@RestController
public class ScriptExecuteController extends BaseController {

    @Resource
    private IGroovyScriptEngine groovyScriptEngine;

    @GetMapping("executeScript/{scriptContent}")
    public Object executeScript(@PathVariable String scriptContent) {
        JSONObject jsonObject = new JSONObject();
        try {
            Map<String, Object> map = new HashMap<>(10);
            Object obj = this.groovyScriptEngine.executeObject(scriptContent, map);
            jsonObject.put("val", obj);
            jsonObject.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("val", "出错了" + e.getMessage());
        }
        jsonObject.put("script", scriptContent);
        return jsonObject;
    }
}
