package lesson4;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException(String message) {
        super(message);
    }
}
