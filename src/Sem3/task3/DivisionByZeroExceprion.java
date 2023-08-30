package Sem3.task3;

public class DivisionByZeroExceprion extends ArithmeticException{
    private  static final String message = "Деление на ноль";
    public DivisionByZeroExceprion() {
        super(message);
    }

    public DivisionByZeroExceprion(String s) {
        super(s);
    }
}
