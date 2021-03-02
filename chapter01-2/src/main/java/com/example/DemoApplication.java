package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
       // SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoApplication.class);
        //builder.bannerMode(Banner.Mode.OFF).run(args);
    }

}
