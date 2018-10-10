package com.pbh.journey.system.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;


/**
 * @author pangbohuan
 * @description admin监控服务
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SystemAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemAdminApplication.class, args);
    }
}
