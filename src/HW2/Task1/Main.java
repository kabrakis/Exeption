package HW2.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        Task1();
    }

    public static void Task1() {
        //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            float result = getFloatFromUser(bufferedReader);
            bufferedReader.close();
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println("Возникла ошибка при работе с файлом");
        }

    }

    public static float getFloatFromUser(BufferedReader bufferedReader) {
        System.out.print("Введите число: ");
        float result;
        try {
            result = Float.parseFloat(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Произошла ошибка при преобразовании введенного значения в число с плавающей точкой");
            return getFloatFromUser(bufferedReader);
        } catch (Exception e) {
            System.out.println("Произошла ошибка при получении числа");
            return getFloatFromUser(bufferedReader);
        }

        return result;
    }

}

