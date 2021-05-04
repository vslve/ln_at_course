package exceptions;

public class WrongFoodException extends RuntimeException{
    public WrongFoodException() {
        super();
    }

    public WrongFoodException(String message) {
        super(message);
    }
}
