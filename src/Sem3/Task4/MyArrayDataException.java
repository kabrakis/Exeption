package Sem3.Task4;

public class MyArrayDataException extends NumberFormatException{
    public static  final  String MESSAGE = "Эллемент массива не число в позиции";
    public MyArrayDataException() {
        super(MESSAGE);
    }

    public MyArrayDataException(String s) {
        super(MESSAGE+": "+s);
    }
}
