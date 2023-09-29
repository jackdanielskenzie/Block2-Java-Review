package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // ARRANGE (Input)
        Calculator calculator = new Calculator();
        int inputA = 1;
        int inputB = 2;
        int expectedOutput = 3;

        // ACT
        int actualOutput = calculator.add(inputA, inputB);

        // ASSERT
        assertEquals(expectedOutput,actualOutput);
    }
}