package gosandrey.spring.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static gosandrey.spring.calculator.CalculatorServiseTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParamTests {
    private static double testResult;
    private static double expected;
    private final CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @MethodSource("testParams")
    public void shouldPlus(double num1, double num2) {
        expected = out.plus(num1, num2);
        testResult = num1 + num2;
        assertEquals(expected, testResult);
    }

    @ParameterizedTest
    @MethodSource("testParams")
    public void shouldMinus(double num1, double num2) {
        expected = out.minus(num1, num2);
        testResult = num1 - num2;
        assertEquals(expected, testResult);
    }

    @ParameterizedTest
    @MethodSource("testParams")
    public void shouldMultiply(double num1, double num2) {
        expected = out.multiply(num1, num2);
        testResult = num1 * num2;
        assertEquals(expected, testResult);
    }

    @ParameterizedTest
    @MethodSource("testParams")
    public void shouldDevide(double num1, double num2) {
        expected = out.devide(num1, num2);
        testResult = num1 / num2;
        assertEquals(expected, testResult);

    }

    public static Stream<Arguments> testParams() {
        return Stream.of(
                Arguments.of(NUM1, NUM2),
                Arguments.of(INT_NUM1, INT_NUM2),
                Arguments.of(INT_NUM1, NUM2)
        );
    }
}


