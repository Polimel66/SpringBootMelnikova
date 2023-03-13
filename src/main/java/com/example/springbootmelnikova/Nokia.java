package com.example.springbootmelnikova;

import org.springframework.stereotype.Component;


public class Nokia implements Phone{
    @Override
    public String getBatteryCapacity() {
        return "50%";
    }
}
