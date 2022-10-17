//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//        арифметическое элементов каждого массива и сообщите, для какого из
//        массивов это значение оказалось больше (либо сообщите, что их средние
//        арифметические равны).

import java.util.Arrays;

public class HW5Array {

    public static void main(String[] args) {
        int[] myFirstArray = new int[15];
        int[] mySecondArray = new int[15];

        fillArray(myFirstArray);
        fillArray(mySecondArray);
        for (int j : myFirstArray) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
        for (int k : mySecondArray) {
            System.out.print(k + " ");
        }
        System.out.print("\n");

        double averageFirst = findAverage(myFirstArray);
        double averageSecond = findAverage(mySecondArray);

        setAverageComparison(averageFirst, averageSecond);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);
        }
    }

//    public static double findAverage(int[] array) { //новый пустой массив. Называем, как хотим
//        OptionalDouble average = Arrays.stream(array).average();
//        System.out.print(average);
//        if (average.isPresent()) {
//            return average.getAsDouble();
//        } else {
//            return 0.0;
//        }
//    }

    public static double findAverage(int[] array) {
        return (double) Arrays.stream(array).sum() / array.length;
    }

    public static void setAverageComparison(double sumFirst, double sumSecond) { //новые пустые переменные. Называем, как угодно
        if (sumFirst > sumSecond) {
            System.out.print("Average first more average second: " + sumFirst + " " + sumSecond);
        } else if (sumFirst < sumSecond) {
            System.out.print("Average first less average second: " + sumFirst + " " + sumSecond);
        } else if (sumFirst == sumSecond) {
            System.out.print("Average first equals average second: " + sumFirst + " " + sumSecond);
        }
    }
}
