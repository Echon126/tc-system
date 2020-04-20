package com.tianta.tc.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ZKTT
 */
@MapperScan({"com.tianta.tc.db.mapper"})
@ComponentScan({"com.tianta.tc.*"})
@SpringBootApplication
public class TcSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcSystemApplication.class, args);
    }
}
