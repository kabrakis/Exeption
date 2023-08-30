package Sem3.task1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(dirRead()));
        } catch (IOException e) {
            e.getStackTrace();
            System.out.println("Не получилось создать файл");
        }
    }
    public static String[] dirRead () throws IOException {
        String [] dirList = null;

        File newFile = new File("test.txt");
        newFile.createNewFile();

        File currentDir = new File (",");
        currentDir.list();
        return dirList;
    }
}
