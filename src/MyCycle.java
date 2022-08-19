
// 1-1
//Написать частотный словарь - посчитать сколько раз каждое
//слово встречается в предложении и вывести результат в консоль

import java.util.Arrays;
import java.util.Scanner;

public class MyCycle {
    public static void main (String[] args) {
        System.out.println("Enter you dot dictionary: ");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] array = inputLine.split("\\s");
        String[] result = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            int wordSum = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    wordSum++;
                }
            }
            result[i] = ("Word: " + array[i] + " repeat " + wordSum + " once");
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                for (int j = i + 1; j < result.length; j++){
                    if (result[i].equals(result[j])) {
                        result[j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                System.out.println(result[i]);
            }
        }
    }
}

