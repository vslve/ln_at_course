import java.util.Scanner;

public class ConsoleCalculator {
    private final Calculator calculator = new Calculator();
    private final Scanner scanner = new Scanner(System.in);

    private String getOperation() {
        System.out.print("Enter operation type(+, -, *, /): ");
        return scanner.nextLine();
    }

    private String getOperand() {
        System.out.print("Enter operand: ");
        return scanner.nextLine();
    }

    public void calculate() {
        final int firstOperand = Integer.parseInt(getOperand());
        final int secondOperand = Integer.parseInt(getOperand());

        switch(getOperation()) {
            case "+":
                System.out.println(calculator.sum(firstOperand, secondOperand));
                break;
            case "-":
                System.out.println(calculator.subtract(firstOperand, secondOperand));
                break;
            case "/":
                System.out.println(calculator.divide(firstOperand, secondOperand));
                break;
            case "*":
                System.out.println(calculator.multiply(firstOperand, secondOperand));
                break;
            default:
                throw new IllegalArgumentException();
        };
    }
}
