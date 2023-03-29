import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    private Scanner scanner = new Scanner(System.in);
    private List<String> list = new ArrayList<>();


    public void addItem() {
        System.out.print("Vertel ons uw boodschap: ");
        String item = scanner.nextLine();
        System.out.print("Wat is de prijs van het product? ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        list.add(item + " - €" + price);
        System.out.println(item + " is toegevoegd aan de boodschappenlijst voor €" + price);
    }
    public void removeItem() {
        System.out.print("Voer het item in dat u wilt verwijderen: ");
        String item = scanner.nextLine();
        if (list.remove(item)) {
            System.out.println(item + " is verwijderd uit de lijst.");
        } else {
            System.out.println(item + " is niet gevonden in de lijst.");
        }
    }

    public List<String> getList() {
        return list;
    }

}
