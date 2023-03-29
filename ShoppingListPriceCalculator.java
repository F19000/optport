import java.util.List;

import java.util.List;

public class ShoppingListPriceCalculator {
    public static double calculateTotalPrice(List<String> myList) {
        double totalPrice = 0.0;
        for (String item : myList) {
            String[] parts = item.split(" - €");
            if (parts.length == 2) {
                try {
                    double price = Double.parseDouble(parts[1]);
                    totalPrice += price;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price for item: " + item);
                }
            } else {
                System.out.println("Invalid format for item: " + item);
            }
        }
        return totalPrice;
    }
}