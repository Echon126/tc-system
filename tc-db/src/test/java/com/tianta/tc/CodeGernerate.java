package com.tianta.tc;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CodeGernerate {
    //数据库
    private static final String url = "jdbc:mysql://localhost:3306/tc-system?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=round&serverTimezone=GMT";
    private static final String driverName = "com.mysql.cj.jdbc.Driver";
    private static final String userName = "root";
    private static final String password = "root";

    //生成在该目录下
    private static final String package_name = "com.tianta.tc.db.domain";


    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        File file = new File("");
        String projectPath = file.getAbsolutePath();
        //String projectPath = System.getProperty("tmanager");

        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("admin");
        gc.setOpen(false);
        //gc.setSwagger2(true);
        gc.setIdType(IdType.AUTO);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setMapperName("%sMapper");
//        gc.setControllerName(  "%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl(url);
        // dsc.setSchemaName("public");
        dsc.setDriverName(driverName);
        dsc.setUsername(userName);
        dsc.setPassword(password);

        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setModuleName(scanner("模块名"));
        pc.setParent(package_name);
        pc.setEntity("tc.entity");
        pc.setMapper("tc.mapper");
        pc.setService("tc.repository");
        pc.setServiceImpl("tc.repository.impl");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return projectPath + "/src/main/resources/mybatis/mappers/tc" /*+ pc.getModuleName()*/
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setEntityBuilderModel(false);
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        strategy.setInclude(new String[]{"tc_command_data", "tc_data_type","tc_inject_data","tc_monitor_log","tc_rule","tc_rule_condition","tc_sequence","tc_sequence_data"}); // 需要生成的表
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }


}
