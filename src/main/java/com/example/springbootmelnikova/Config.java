package com.example.springbootmelnikova;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
    @Bean
    public Phone getIphone() {
        return new Iphone();
    }

    @Bean
    public Phone getNokia() {
        return new Nokia();
    }
}
