
//1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//        созданием массива подумайте, какого он будет размера.


import java.util.Arrays;
import java.util.Random;

public class ArrayTasks {
    public static void main (String[] args) {

//        int[] array = new int[20];
//
//        Random random = new Random();
//        for(int i= 0; i < array.length; i++)
//        {
//                array[i]  = (random.nextInt(20));
//                System.out.println("arr[" + i + "]=" + array[i]);
//
//        }
//        System.out.println("The numbers in the array are generated.");

        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < 10; i++) {   //идём по строкам

            System.out.print(" " + array[i] + " ");    //вывод элемента в строку
            System.out.print(" " + array[i] + "\n");    //вывод элемента в столбец
        }


//        char [][] array = {{'0','1','2'}, {'3','4','5'}, {'6','7','8'}};     //объявили массив и заполнили его элементами
//        for (int i = 0; i < 3; i++) {   //идём по строкам
//            for (int j = 0; j < 3; j++) {   //идём по столбцам
//                System.out.print(" " + array[i][j] + " ");    //вывод элемента
//            }
//            System.out.println();   //перенос строки для сохранения табличной формы
//        }

    }
}
