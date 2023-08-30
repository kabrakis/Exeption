package Sem3.Task4;

public class Task4 {
    public static void main(String[] args) {
        String[][] myArray = {{"wer", "sdf", "12", "zxcv"},
                {"13", "123", "456", "werrqqq"},
                {"asdfas", "sdf", "sdfss", "zfghhxcv"},
                {"456", "rtyertyds", "123", "zxcv"}};
        String[][] myArray1 = {{"wer", "sdf", "12", "zxcv"},
                {"234", "1223453", "1234", "123"},
                {"234", "245", "456", "567"},
                {"456", "345", "123", "456"}};
        String[][] myArray2 = {{"wer", "sdf", "12", "zxcv"},
                {"13", "2134", "456", "werrqqq"},
                {"asdfas", "sdf", "sdfss", "zfghhxcv"},
                {"456", "rtyertyds", "123", "zxcv"}};
//        arraySum(myArray);
//        arraySum(myArray1);
//        arraySum(myArray2);
    }

    public static int arraySum(String[][] arr) {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException(arr.length+","+arr[0].length);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i + "," + j);
                }
            }

        }
        return sum;
    }
}

