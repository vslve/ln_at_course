import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    final Calculator calculator = new Calculator();

    static List<Arguments> generateSumTestData() {
        return List.of(
                Arguments.of(7, 2, 5),
                Arguments.of(-7, -2, -5),
                Arguments.of(1, 1, 0),
                Arguments.of(0, 5, -5)
        );
    }

    static List<Arguments> generateSubtractTestData() {
        return List.of(
                Arguments.of(2, 7, 5),
                Arguments.of(-2, -7, -5),
                Arguments.of(1, 1, 0),
                Arguments.of(10, 5, -5),
                Arguments.of(-10, -5, 5)
        );
    }

    static List<Arguments> generateMultiplyTestData() {
        return List.of(
                Arguments.of(10, 5, 2),
                Arguments.of(10, -5, -2),
                Arguments.of(0, 1, 0),
                Arguments.of(-10, -5, 2)
        );
    }

    static List<Arguments> generateDivideTestData() {
        return List.of(
                Arguments.of(5, 10, 2),
                Arguments.of(5, -10, -2),
                Arguments.of(0, 0, 1),
                Arguments.of(-5, -10, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("generateSumTestData")
    void sum(int expected, int firstOperand, int secondOperand) {
        assertEquals(expected, calculator.sum(firstOperand, secondOperand));
    }

    @ParameterizedTest
    @MethodSource("generateMultiplyTestData")
    void multiply(int expected, int firstOperand, int secondOperand) {
        assertEquals(expected, calculator.multiply(firstOperand, secondOperand));
    }

    @ParameterizedTest
    @MethodSource("generateSubtractTestData")
    void subtract(int expected, int firstOperand, int secondOperand) {
        assertEquals(expected, calculator.subtract(firstOperand, secondOperand));
    }

    @ParameterizedTest
    @MethodSource("generateDivideTestData")
    void divide(int expected, int firstOperand, int secondOperand) {
        assertEquals(expected, calculator.divide(firstOperand, secondOperand));
        assertThrows(ArithmeticException.class, () -> calculator.divide(firstOperand, 0));
    }
}