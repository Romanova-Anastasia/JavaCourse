package lesson2;
import java.util.Scanner;

public class HW_operators {

    //Задача 3-1
    // Написать программу, которая приветствует пользователя
    //в зависимости от его пола и возраста (имя, пол и возраст задаются при старте программы)

    public static void main (String[] args) {
//        System.out.println("Enter you name");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Enter you gender: m or w");
//        String m = "m";
//        String w = "w";
//        String gender = scanner.nextLine();
//        System.out.println("Enter you age");
//        int age = scanner.nextInt();
//
//        if (m.equals(gender.toLowerCase())) {
//            if (age <= 16) {
//                System.out.println("Hi, little boy " + name);
//            } else {
//                System.out.println("Hello, man " + name);
//            }
//        } else if (w.equals(gender.toLowerCase())) {
//            if (age <= 16) {
//                System.out.println("Hi, little girl " + name);
//            } else {
//                System.out.println("Hello, woman " + name);
//            }
//        } else{
//                System.out.println("ERROR");
//            }

        //Задача 3-2
//        Написать 5 способов создания/получения строки
// 1. //строка
//          String str = "Hello ";
//          String newStr = str + "world";
//          System.out.println(newStr); //Hello world

// 2. //один фрагмент не строка, но преобразуется в строку
//          int x = 15;
//          String str = "Variable x = " + x;
//          System.out.println(str); //Variable x = 15

// 3. //если один из аргументов строка, то сложение будет по строковому типу
//          int x = 15;
//          String str = x + "20";
//          System.out.println(str); //1520

// 4. //массив строк
//        String[] cats = {"TOM", "Sunny", "MySoul"};
//        System.out.println(cats[0]); //TOM

// 5. //пустой объект
//        String str = new String();
//        System.out.println(str); //пустой объект

// 6. //строка через массив символов
//        char[] chars = { 'A', 'r', 't', 'e', 'm' };
//        String str = new String(chars);
//        System.out.println(str);

        //Задача 3-3
//        Написать программу, в которой в консоль
//        будет выводится название месяца и сезон, к которму этот месяц
//        относится (написать с помощью if и с помощью switch)

        System.out.println("Enter you month: ");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        //System.out.println("Your month: " + month);

//          if ("january".equals(month.toLowerCase())){
//              System.out.println(month + "  is Winter!");
//          } else if ("february".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Winter!");
//          } else if ("march".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Spring!");
//          } else if ("april".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Spring!");
//          } else if ("may".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Spring!");
//          } else if ("june".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Summer!");
//          } else if ("jule".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Summer!");
//          } else if ("august".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Summer!");
//          } else if ("september".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Autumn!");
//          } else if ("october".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Autumn!");
//          } else if ("november".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Autumn!");
//          } else if ("december".equals(month.toLowerCase())) {
//              System.out.println(month + "  is Winter!");
//          } else {
//              System.out.println(month + " I do not know such a month!");
//          }

        //SWITCH

        switch (month.toLowerCase()) {
            case "january":
            case "february":
            case "december": {
                System.out.println(month + " is Winter!");
                break;
            }
            case "march":
            case "april":
            case "may": {
                System.out.println(month + " is Spring!");
            }
            break;
            case "june":
            case "jule":
            case "august": {
                System.out.println(month + " is Summer!");
            }
            break;
            case "september":
            case "october":
            case "december" :
                    {
                System.out.println(month + " is Winter!");
            }
            break;
            default: {
                System.out.println("\"" + month + " I don't know such a month!");
            }
            }
        }
    }



