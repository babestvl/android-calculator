package com.example.student.calculator.data;

import com.example.student.calculator.main.CalculatorPresenter;
import com.example.student.calculator.main.CalculatorView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.regex.Matcher;

import static org.junit.Assert.assertEquals;

/**
 * Created by jittat on 30/3/2560.
 */

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnZeroAfterReset() {
        calculator.reset();
        assertEquals(0, calculator.getResult());
    }

    @Test
    public void shouldReturnValueAfterSet() {
        calculator.reset();
        calculator.setResult(1234);
        assertEquals(1234, calculator.getResult());
    }

    @Test
    public void shouldAddTwoNumbers() {
        calculator.reset();
        calculator.setResult(1234);
        assertEquals(1334, calculator.operate(calculator.OPERATOR_ADD,100));
    }

    @Test
    public void shouldAddThreeNumbers() {
        calculator.reset();
        calculator.setResult(1234);
        calculator.operate(calculator.OPERATOR_ADD,100);
        assertEquals(1834, calculator.operate(calculator.OPERATOR_ADD,500));
    }
    @Test
    public void shouldMultiplyTwoNumber() {
        calculator.reset();
        calculator.setResult(1000);
        assertEquals(5000, calculator.operate(calculator.OPERATOR_MUL, 5));
    }
    @Test
    public void shouldMultiplyThreeNumber() {
        calculator.reset();
        calculator.setResult(200);
        calculator.operate(calculator.OPERATOR_MUL, 3);
        assertEquals(3000, calculator.operate(calculator.OPERATOR_MUL, 5));
    }
    @Test
    public void shouldDivineTwoNumber() {
        calculator.reset();
        calculator.setResult(5000);
        assertEquals(5, calculator.operate(calculator.OPERATOR_DIV, 1000));
    }
    @Test
    public void shouldDivineThreeNumber() {
        calculator.reset();
        calculator.setResult(200);
        calculator.operate(calculator.OPERATOR_DIV, 4);
        assertEquals(10, calculator.operate(calculator.OPERATOR_DIV, 5));
    }


}
