
// HW4--Cycle Task 1-2
//Написать игру в которой нужно угадать случайно выбранную букву (именно букву).
//        При каждом вводе пользователем программа долна говорить "warmly, hot"
//        или "chilly, cold" в зависимости от того, как далеко буква пользователя от загаданной
//

import java.util.Scanner;

public class TaskGameLetter {
    public static void main(String[] args) {
        char lowerLetter = (char) ('a' + Math.random() * ('z'-'a' + 1));
//        System.out.println(lowerLetter);
        char upperLetter = Character.toUpperCase(lowerLetter); //любую маленькую букву переводит в большую
//        System.out.println(upperLetter);

        boolean isPlay = true;
        while (isPlay) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a letter: ");

            if (!scanner.hasNextInt()) {
                char letterUser = scanner.next().charAt(0);
                System.out.println(letterUser);

                if (lowerLetter == letterUser || upperLetter == letterUser) {
                    System.out.println("You win!!!");
                    isPlay = false;
                } else if (lowerLetter - letterUser < 5 && lowerLetter - letterUser > -5
                        || upperLetter - letterUser < 5 && upperLetter - letterUser > -5) {
                    System.out.println("AYF! HOT!!!");
                } else if (lowerLetter - letterUser < 10 && lowerLetter - letterUser > -10
                        || upperLetter - letterUser < 10 && upperLetter - letterUser > -10) {
                    System.out.println("Easy,easy real talk! Warmly!");
                } else if (lowerLetter - letterUser < 15 && lowerLetter - letterUser > -15
                        || upperLetter - letterUser < 15 && upperLetter - letterUser > -15) {
                    System.out.println("Chilly!");
                } else if (lowerLetter - letterUser < 27 && lowerLetter - letterUser > -27
                        || upperLetter - letterUser < 27 && upperLetter - letterUser > -27) {
                    System.out.println("BRR!!! Cold!");
                }
            } else {
                System.out.println("You enter number!");
            }
        }
    }
}
