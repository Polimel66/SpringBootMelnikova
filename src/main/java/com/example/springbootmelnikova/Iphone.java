package com.example.springbootmelnikova;

import org.springframework.stereotype.Component;

@Component ("phone")
public class Iphone implements Phone{
    @Override
    public String getBatteryCapacity() {
        return "100%";
    }
}
