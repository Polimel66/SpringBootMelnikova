package com.example.springbootmelnikova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BatteryChecker {
    @Autowired
    private Phone phone;
//    public BatteryChecker(Phone phone)
//    {
//        this.phone = phone;
//    }

    public void displayBatteryCapacity()
    {
        System.out.print("Current battery capacity:" + phone.getBatteryCapacity());
    }
}
