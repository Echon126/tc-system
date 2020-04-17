package com.tianta.tc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ZKTT
 */
@ComponentScan({"com.tianta.tc.*"})
@SpringBootApplication
public class TcSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcSystemApplication.class, args);
    }
}
