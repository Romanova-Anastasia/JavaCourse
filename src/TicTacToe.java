
//HW5 Task 1-1
//Написать игру крестики нолики

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main (String[] args) throws IOException {

        char [][] array = {{'0','1','2'}, {'3','4','5'}, {'6','7','8'}};     //объявили массив и заполнили его элементами
        for (int i = 0; i < 3; i++) {   //идём по строкам
            for (int j = 0; j < 3; j++) {   //идём по столбцам
                System.out.print(" " + array[i][j] + " ");    //вывод элемента
            }
            System.out.println();   //перенос строки для сохранения табличной формы
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your move: ");
        char userX = scanner.next().charAt(0);
      //  System.out.println(userX);

        char [][] array1 = {{'0',userX,'2'}, {'3','4','5'}, {'6','7','8'}};
        for (int i = 0; i < 3; i++) {   //идём по строкам
            for (int j = 0; j < 3; j++) {   //идём по столбцам
                System.out.print(" " + array1[i][j] + " ");    //вывод элемента
            }
            System.out.println();   //перенос строки для сохранения табличной формы
        }


        System.out.print(array[0][1]);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//        System.out.println("We read this line from the keyboard:");
//        System.out.println(s);

    }
}
