import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ShoppingList shoppingList = new ShoppingList();

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelecteer wat u wilt doen");
            System.out.println("1. Bekijk boodschappen");
            System.out.println("2. Boodschappen toevoegen");
            System.out.println("3. Boodschappen verwijderen");
            System.out.println("4. Sla uw boodschappen op in een txt bestand");
            System.out.println("5. Bekijk totaalprijs van uw boodschappen");
            System.out.println("6. Verlaat programma");

            String keuze= scanner.nextLine();

            switch (keuze) {
                case "1":
                    ShoppingListShow.showList(shoppingList.getList());
                    break;
                case "2":
                    shoppingList.addItem();
                    break;
                case "3":
                    shoppingList.removeItem();                    break;
                case "4":
                    ShoppingListFileHandler.saveListToFile(shoppingList.getList());
                    break;
                case "5":
                    double totalPrice = ShoppingListPriceCalculator.calculateTotalPrice(shoppingList.getList());
                    System.out.println("Totaalprijs van uw boodschappen: €" + String.format("%.2f", totalPrice));
                    break;
                case "6":
                    exit = true;
                    break;
                default:
                    System.out.println("Kan niet.");
            }
        }

        System.out.println("U heeft de lijst afgesloten");
    }
}
