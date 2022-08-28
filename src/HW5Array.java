//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//        арифметическое элементов каждого массива и сообщите, для какого из
//        массивов это значение оказалось больше (либо сообщите, что их средние
//        арифметические равны).

import java.util.Arrays;

public class HW5Array {

    public static void main (String[] args){
        double[] myFirstArray = new double[15];
        double[] mySecondArray = new double[15];

        setFirstArray(myFirstArray);
        setSecondArray(mySecondArray);
        for(double j : myFirstArray){
            System.out.print(j + " ");
        }
        System.out.print("\n");
        for(double k : mySecondArray){
            System.out.print(k + " ");
        }
        System.out.print("\n");

        double sumFirst = Arrays.stream(myFirstArray).sum()/15;
        double sumSecond = Arrays.stream(mySecondArray).sum()/15;

        if (sumFirst > sumSecond) {
            System.out.print("Average first more average second: " + sumFirst + " " + sumSecond);
        }
        else if (sumFirst < sumSecond) {
            System.out.print("Average first less average second: "  + sumFirst + " " + sumSecond);
        }
        else if (sumFirst == sumSecond) {
            System.out.print("Average first equals average second: "  + sumFirst + " " + sumSecond);
        }
    }

    public static void setFirstArray(double[] myFirstArray){
        for ( int i = 0; i < myFirstArray.length; i++){
            myFirstArray[i] = (int) (Math.random() * 5);
        }
    }
    public static void  setSecondArray(double[] mySecondArray){
        for ( int i = 0; i < mySecondArray.length; i++){
            mySecondArray[i] = (int) (Math.random() * 5);
        }
    }

//    public static void setAverageFirst(int[] myFirstArray){
//        OptionalDouble sumFirst = Arrays.stream(myFirstArray).average();
//        System.out.print(sumFirst);
//    }
//
//    public static void setAverageSecond(int[] mySecondArray){
//        OptionalDouble sumSecond = Arrays.stream(mySecondArray).average();
//            System.out.print(sumSecond);
//    }

//    public static void setAverageComparison (double sumSecond, double sumFirst ){
//        if (sumFirst > sumSecond) {
//            System.out.print("Average first more average second: " + sumFirst);
//        }
//        else if (sumFirst < sumSecond) {
//            System.out.print("Average first less average second: ");
//        }
//        else if (sumFirst == sumSecond) {
//            System.out.print("Average first equals average second: "  + sumFirst + " " + sumSecond);
//        }
//    }
}
