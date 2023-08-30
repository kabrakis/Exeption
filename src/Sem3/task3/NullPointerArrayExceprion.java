package Sem3.task3;

public class NullPointerArrayExceprion extends NullPointerException{
    private  static final String message = "Обращение к NULL эллементу";
    public NullPointerArrayExceprion() {
        super(message);
    }

    public NullPointerArrayExceprion(String s) {
        super(s);
    }
}
