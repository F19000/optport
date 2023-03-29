import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingListFileHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static void saveListToFile(List<String> myList) {
        System.out.print("Geef uw lijst een naam: ");
        String filename = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(filename);
            for (String item : myList) {
                writer.write(item + "\n");
            }
            writer.close();
            System.out.println("Uw lijst is opgeslagen in " + filename);
        } catch (IOException e) {
            System.out.println("Er is een fout opgetreden bij het opslaan van uw lijst: " + e.getMessage());
        }
    }


}
