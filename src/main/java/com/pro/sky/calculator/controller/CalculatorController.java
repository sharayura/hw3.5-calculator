package com.pro.sky.calculator.controller;

import com.pro.sky.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    CalculatorService calculatorService = new CalculatorService();

    @GetMapping("/calculator")
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @RequestMapping("/calculator/plus")
    public String plus(@RequestParam Integer num1, Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @RequestMapping("/calculator/minus")
    public String minus(@RequestParam Integer num1, Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @RequestMapping("/calculator/multiply")
    public String multiply(@RequestParam Integer num1, Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @RequestMapping("/calculator/divide")
    public String divide(@RequestParam Integer num1, Integer num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
