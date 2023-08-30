package task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ApplicationExceptions01 {
    public static void main(String[] args) {
        String fileName = initFile();
        writeFile(parseFile(readFile(fileName)), fileName);
    }

    private static void writeFile(HashMap<String, String> hashMap, String fileName) {
        File file = new File(fileName);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            for (Map.Entry<String, String> line : hashMap.entrySet()) {
                fr.write(line.getKey() + "=" + line.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Can't write file!");
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println("Can't close file!");
            }
        }

    }

    private static HashMap<String, String> parseFile(HashMap<String, String> hashMap) {
        for (Map.Entry<String, String> line : hashMap.entrySet()) {
            if (line.getValue().equals("?")) {
                line.setValue(String.valueOf(line.getKey().length()));
            }
        }
        return hashMap;
    }

    private static HashMap<String, String> readFile(String fileName) {
        HashMap<String, String> hmNames = new HashMap<String, String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {

                String[] lineParts = line.split("=");
                hmNames.put(lineParts[0], lineParts[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e.getStackTrace());
            }
        }

        return hmNames;
    }

    private static String initFile() {
        File file = new File("Names.txt");
        FileWriter fr = null;
        try {
            file.createNewFile();
            fr = new FileWriter(file);
            fr.write("Анна=4\n" +
                    "Елена=5\n" +
                    "Марина=6\n" +
                    "Владимир=?\n" +
                    "Константин=?\n" +
                    "Иван=4");
        } catch (IOException e) {
            System.out.println("Can't create file!");
        } finally {
            try {
                fr.flush();
                fr.close();
            } catch (IOException e) {
                System.out.println("Can't close file!");
            }
        }
        return file.getName();
    }

}
