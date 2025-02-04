package day02.exception.userDefineEx;

public class InsufficientEx extends Exception{
    String message;

    public InsufficientEx(String message) {
        super(message);
    }
}
