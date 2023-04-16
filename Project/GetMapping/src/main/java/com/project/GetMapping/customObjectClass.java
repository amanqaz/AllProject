package com.project.GetMapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class customObjectClass {

    @Bean
    public mailApiObject objCreate(){
        System.out.print("created");
        return new mailApiObject();
    }
    @Bean("qualifier")
    public mailApiObject objCreate2(){
        System.out.print("created");
        return new mailApiObject("krishna");
    }
}
