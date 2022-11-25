package com.pro.sky.calculator.service;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceTestParam {

    CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void divide(Integer num1, Integer num2, Integer expected) {
        Integer actual = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(50, 5, 10),
                Arguments.of(24, 6, 4)
        );
    }
}
