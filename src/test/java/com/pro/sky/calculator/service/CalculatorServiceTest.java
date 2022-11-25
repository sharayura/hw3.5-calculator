package com.pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();
    private final Integer num0 = 0;
    private final Integer num1 = 5;
    private final Integer num2 = 5;
    private final Integer num3 = 10;
    private final Integer num4 = 2;

    @Test
    public void plus() {
        Integer expected = num1 + num2;
        Integer actual = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);
        expected = num3 + num4;
        actual = calculatorService.plus(num3, num4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minus() {
        Integer expected = num1 - num2;
        Integer actual = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);
        expected = num3 - num4;
        actual = calculatorService.minus(num3, num4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiply() {
        Integer expected = num1 * num2;
        Integer actual = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);
        expected = num3 * num4;
        actual = calculatorService.multiply(num3, num4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        Integer expected = num1 / num2;
        Integer actual = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);
        expected = num3 / num4;
        actual = calculatorService.divide(num3, num4);
        Assertions.assertEquals(expected, actual);
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num3, num0));
    }


}
