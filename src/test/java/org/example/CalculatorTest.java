package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void pres(){
        System.out.println("Before each"); //method which run first everywhere
    }
    @AfterEach
    void pres1(){
        System.out.println("Before each"); //method which run first everywhere
    }

    @BeforeAll
    void presAfter(){
        System.out.println("Before each"); //method which run first everywhere
    }

    @Test
    void calculate() {
        Calculator calculator = new Calculator();

        int sum = calculator.calculate(2, 2, "sum");

        assertEquals(4,sum);  //проверяем утверждение
    }
    @Test
    void calculate1() {
        Calculator calculator = new Calculator();

        int sum = calculator.calculate(2, 2, "sum");

        assertEquals(4,sum);  //проверяем утверждение
    }
    @Test
    void calculate2() {
        Calculator calculator = new Calculator();

        int sum = calculator.calculate(2, 2, "sum");

        assertEquals(4,sum);  //проверяем утверждение
    }
}