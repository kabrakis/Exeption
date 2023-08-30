package Sem3.task3;

import java.io.FileNotFoundException;

public class FileDontExistException extends FileNotFoundException {
    private  static final String message = "Файл не существует";
    public FileDontExistException() {
        super(message);
    }

    public FileDontExistException(String s) {
        super(s);
    }
}
