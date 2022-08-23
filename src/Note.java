import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Note {

    public Note(String name, Date dateDeathConvert, String descriptionDeath) {
    }

    public static void main(String[] args) throws ParseException {

        DeathNote[] noteBook = new DeathNote[3];

        Scanner scanner = new Scanner(System.in);
        String name;
        String dateDeath;
        String descriptionDeath;


        for (int i = 0; i < noteBook.length; i++) {
            System.out.println("Input name person: " + (i + 1));
            name = scanner.nextLine();
            System.out.println("Input date of Death in dd/MM/yyyy format: " + (i + 1));
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            dateDeath = scanner.nextLine();
            Date dateDeathConvert = format.parse(dateDeath);

            System.out.println("Input description of Death " + (i + 1));
            descriptionDeath = scanner.nextLine();

            noteBook[i] = new DeathNote(
                    name,
                    dateDeathConvert,
                    descriptionDeath
            );
        }
                for (int i = 0; i < noteBook.length; i++) {
                    System.out.println(noteBook[i] + " " + i);
                }

        System.out.println("Enter the index of the record to whom we want to report the death");
        int index = scanner.nextInt();
        for (int i = 0; i < noteBook.length; i++) {
            if (noteBook[i] == noteBook[index]) {
                noteBook[i].greetings();
            }
        }
    }
}
