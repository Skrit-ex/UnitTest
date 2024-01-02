package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculate() {
        Calculator calculator = new Calculator();

        int sum = calculator.calculate(2, 2, "sum");

        assertEquals(4,sum);  //проверяем утверждение
    }
}