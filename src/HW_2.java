/*  System.out.println("Enter your name and click <Enter>:");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Hi, " + name);
    scan.close();

Задание 3
    Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
*/
import java.util.Scanner;
public class HW_2 {
    public static void main (String[] args){
        /*
        int s = 666666;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int weeks = (d - day) / 7;
        System.out.println(min + " minute " + sec + " second");
        System.out.println(h + " hour " + min + " minute " + sec + " second");
        System.out.println(d + " day " + h + " hour " + min + " minute " + sec + " second");
        System.out.println(weeks + " weeks " + d + " day " + h + " hour " + min + " minute " + sec + " second");
        */

        /*
Задание 4
        Определить число, полученное выписыванием в обратном порядке цифр
        любого 4-х значного натурального числа n*/
/*
        int number = 8566;
        System.out.println(number%10);
        System.out.println(number/10%10);
        System.out.println(number/100%10);
        System.out.println(number/1000%10);
*/
/*
Задание 5
        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        различны?
*/
        System.out.println("Enter you number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
      boolean comparison =  number%10 != number/10%10
                            && number/10%10 != number/100%10
                            && number/100%10 != number/1000%10;
      System.out.println(comparison);
    }
}



