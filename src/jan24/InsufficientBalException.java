package jan24;

public class InsufficientBalException extends RuntimeException{
    public InsufficientBalException(String message) {
        super(message);
    }
}
