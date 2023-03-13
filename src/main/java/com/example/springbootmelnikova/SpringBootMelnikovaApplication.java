package com.example.springbootmelnikova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringBootMelnikovaApplication {

    public static void main(String[] args) {
        // SpringApplication.run(SpringBootMelnikovaApplication.class, args);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        var bean = ctx.getBean("getIphone", Iphone.class);
        System.out.print(bean.getBatteryCapacity());
    }

}
