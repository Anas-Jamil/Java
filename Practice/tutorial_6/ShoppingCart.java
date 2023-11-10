import java.text.NumberFormat;
import java.util.Scanner;

public class shoppingsimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item[] cart = new Item[20];             // Assuming a maximum of 20 items in the cart
        int itemCount = 0;

        while (true) {
            // Read item details from the user.
            System.out.print("Enter the name of the item: (Type 'quit' to exit code)");
            String itemName = scanner.next();

            if (itemName.equals("quit")) {
                break; // Exit the loop if the user enters 'q'.
            }

            System.out.print("Enter the price of the item: ");
            double itemPrice = scanner.nextDouble();

            System.out.print("Enter the quantity of the item: ");
            int quantity = scanner.nextInt();

            // Add the item to the shopping cart.
            Item item = new Item(itemName, itemPrice, quantity);
            cart[itemCount] = item;
            itemCount++;

            // Print the contents of the cart.
            System.out.println("The Cart Contents are:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(cart[i].toString());
            }

            // Calculate and print the total price.
            double totalPrice = 0.0;
            for (int i = 0; i < itemCount; i++) {
                totalPrice += cart[i].getPrice() * cart[i].getQuantity();
            }

            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            System.out.println("Please pay: " + fmt.format(totalPrice));
            }


        scanner.close();
    }
}
