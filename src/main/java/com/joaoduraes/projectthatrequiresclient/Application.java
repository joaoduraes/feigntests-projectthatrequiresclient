package com.joaoduraes.projectthatrequiresclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.joaoduraes.projectthatrequiresclient",
        "com.joaoduraes.projectwithclient"
}
)
@EnableAutoConfiguration
@EnableFeignClients(basePackages = {"com.joaoduraes.projectthatrequiresclient",
        "com.joaoduraes.projectwithclient"
}
)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
