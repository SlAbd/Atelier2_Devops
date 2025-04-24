package com.project.atelier_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

        @Test
        public void testAdd() {
            Calculator calc = new Calculator();
            assertEquals(5, calc.add(2, 3));
        }

        @Test
        public void testMultiply() {
            Calculator calc = new Calculator();
            assertEquals(6, calc.multiply(2, 3));
        }

}
