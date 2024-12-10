import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the price of the item
        System.out.print("Enter the price of the item: $");
        double price = scanner.nextDouble();

        // Calculate shipping cost
        double shippingCost;
        if (price >= 100) {
            shippingCost = 0; // Free shipping for items $100 or more
        } else {
            shippingCost = price * 0.02; // 2% shipping cost for items less than $100
        }

        // Calculate total price
        double totalPrice = price + shippingCost;

        // Output the shipping cost and total price
        System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
        System.out.printf("Total Price: $%.2f%n", totalPrice);

        // Close the scanner
        scanner.close();
    }
}