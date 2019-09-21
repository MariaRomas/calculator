package ru.mospolytech.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calc = null;
    }

    @Test
    public void calculatePlus() throws Exception {
        calc.first = 1;
        calc.second = 2;
        calc.operation = "+";
        assertEquals(3, calc.calculate());
    }
    @Test
    public void calculateMinus() throws Exception{
        calc.first = 6;
        calc.second = 2;
        calc.operation = "-";
        assertEquals(4, calc.calculate());
    }
    @Test
    public void calculateMulty() throws Exception{
        calc.first = 1;
        calc.second = 2;
        calc.operation = "*";
        assertEquals(2, calc.calculate());
    }
    @Test
    public void calculateDivide() throws Exception{
        calc.first = 6;
        calc.second = 2;
        calc.operation = "/";
        assertEquals(3, calc.calculate());
    }
    @Test (expected = ArithmeticException.class)
    public void calculateDivideZero() throws Exception{
        calc.first = 1;
        calc.second = 0;
        calc.operation = "/";
        assertEquals(2, calc.calculate());
    }
    @Test (expected = IOException.class)
    public void calculateUnknownOperation() throws Exception {
        calc.first = 1;
        calc.second = 2;
        calc.operation = "%";
        assertEquals(3, calc.calculate());
    }
}