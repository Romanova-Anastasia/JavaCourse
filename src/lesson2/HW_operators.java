package lesson2;
import java.util.Scanner;

public class HW_operators {

    //Задача 3
    // Написать программу, которая приветствует пользователя
    //в зависимости от его пола и возраста (имя, пол и возраст задаются при старте программы)

    public static void main (String[] args) {
        System.out.println("Enter you name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter you gender: m or w");
        String m = "m";
        String w = "w";
        String gender = scanner.nextLine();
        System.out.println("Enter you age");
        int age = scanner.nextInt();

        if (m.equals(gender.toLowerCase())) {
            if (age <= 16) {
                System.out.println("Hi, little boy " + name);
            } else {
                System.out.println("Hello, man " + name);
            }
        } else if (w.equals(gender.toLowerCase())) {
            if (age <= 16) {
                System.out.println("Hi, little girl " + name);
            } else {
                System.out.println("Hello, woman " + name);
            }
        } else{
                System.out.println("ERROR");
            }
    }
}
