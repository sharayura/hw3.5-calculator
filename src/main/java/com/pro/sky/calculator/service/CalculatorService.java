package com.pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {

    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        }
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        }
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        }
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null || num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }

}
