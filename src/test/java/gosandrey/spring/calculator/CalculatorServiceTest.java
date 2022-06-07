package gosandrey.spring.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static gosandrey.spring.calculator.CalculatorServiseTestConstants.*;


class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorService();
    private static double expected;
    private static double testResult;

    @Test
    void shouldPlus() {
        expected = out.plus(NUM1, INT_NUM1);
        testResult = NUM1 + INT_NUM1;
        assertEquals(expected, testResult);
    }

    @Test
    void shouldMinus() {
        expected = out.minus(NUM2, INT_NUM2);
        testResult = NUM2 - INT_NUM2;
        assertEquals(expected, testResult);
    }

    @Test
    void shouldMultiply() {
        expected = out.multiply(NUM2, INT_NUM2);
        testResult = NUM2 * INT_NUM2;
        assertEquals(expected, testResult);
    }

    @Test
    void shouldDevide() {
        expected = out.devide(NUM2, INT_NUM2);
        testResult = NUM2 / INT_NUM2;
        assertEquals(expected, testResult);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfZero() {
        assertThrows(IllegalArgumentException.class, () -> out.devide(NUM1, ZERO));
    }
}