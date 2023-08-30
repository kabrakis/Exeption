package Sem3.Task4;

public class MyArraySizeException extends IllegalArgumentException{
    public static  final  String MESSAGE = "размерность";

    public MyArraySizeException() {
        super(MESSAGE);
    }

    public MyArraySizeException(String s) {
        super(MESSAGE+ s);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArraySizeException(Throwable cause) {
        super(cause);
    }
}
