import java.util.List;

public class ShoppingListShow {
    public static void showList(List<String> list) {
        System.out.println("\nBoodschappenlijst:");
        if (list.isEmpty()) {
            System.out.println("Lijst is leeg.");
        } else {
            for (String item : list) {
                System.out.println(item);
            }
        }
    }
}