import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ConsoleCalculatorTest {
    private final String GET_OPERATION_MESSAGE = "Enter operation type(+, -, *, /): ";
    private final String  GET_OPERAND_MESSAGE = "Enter operand: ";

    private final String FIRST_OPERAND = "5";
    private final String SECOND_OPERAND = "5";

    private final String SUM_SIGN = "+";
    private final String MULTIPLY_SIGN = "*";
    private final String SUBTRACT_SIGN = "-";
    private final String DIVIDE_SIGN = "/";
    private final String INCORRECT_SIGN = ";";

    private final String OUTPUT = GET_OPERAND_MESSAGE + GET_OPERAND_MESSAGE + GET_OPERATION_MESSAGE;
    private final String INPUT = FIRST_OPERAND + "\n" + SECOND_OPERAND + "\n";

    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void tearDawn() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

    @Test
    void sum() {
        System.setIn(new ByteArrayInputStream((INPUT + SUM_SIGN + "\n").getBytes()));

        new ConsoleCalculator().calculate();

        assertEquals(OUTPUT + "10\n", out.toString());
    }

    @Test
    void multiply() {
        System.setIn(new ByteArrayInputStream((INPUT + MULTIPLY_SIGN + "\n").getBytes()));

        new ConsoleCalculator().calculate();

        assertEquals(OUTPUT + "25\n", out.toString());
    }

    @Test
    void subtract() {
        System.setIn(new ByteArrayInputStream((INPUT + SUBTRACT_SIGN + "\n").getBytes()));

        new ConsoleCalculator().calculate();

        assertEquals(OUTPUT + "0\n", out.toString());
    }

    @Test
    void divide() {
        System.setIn(new ByteArrayInputStream((INPUT + DIVIDE_SIGN + "\n").getBytes()));

        new ConsoleCalculator().calculate();

        assertEquals(OUTPUT + "1\n", out.toString());
    }

    @Test
    void exception() {
        System.setIn(new ByteArrayInputStream((INPUT + INCORRECT_SIGN + "\n").getBytes()));

        assertThrows(IllegalArgumentException.class, () -> new ConsoleCalculator().calculate());
    }
}