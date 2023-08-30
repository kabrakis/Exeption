package Sem3.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) throws FileDontExistException {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new DivisionByZeroExceprion();
        }
        String[] strArr = {"123", null, "qwerty"};
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == null) {
                throw new NullPointerArrayExceprion("эллемента с индексом" + i + "NULL");
            } else {
                System.out.println(strArr[i]);
            }


            File rndFile = new File("test1.txt");

            if (!rndFile.exists()) {
                try {
                    throw new FileDontExistException();
                } catch (FileDontExistException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

}
