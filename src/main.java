import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        item.printManu();

        register register = new register();

        while (true) {
            String itemName;
            while (true) {
                System.out.println("Please select item:");
                itemName = input.next().toLowerCase();
                if (!item.exists(itemName)) {
                    System.out.println("Invalid input: item not found.");
                } else {
                    break;
                }
            }

            int quantity;
            while (true) {
                System.out.println("Quantity:");
                try {
                    quantity = input.nextInt();
                    if (quantity <= 0) {
                        System.out.println("Invalid input: quantity must be greater than 0.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input: please enter a number.");
                    input.next();
                }
            }

            register.addItem(itemName, quantity);

            input.nextLine();

            String answer;
            while (true) {
                System.out.println("Do you want to finish? (yes/no):");
                answer = input.nextLine().toLowerCase();
                if (answer.equals("yes") || answer.equals("no")) break;
                else System.out.println("Invalid input: please enter 'yes' or 'no'.");
            }

            if (answer.equals("yes")) break;
        }

        int total = register.bill(0);
        System.out.println("Total: " + total);

        int pay;
        while (true) {
            System.out.println("How much would you like to pay?");
            try {
                pay = input.nextInt();
                if (pay < total) {
                    System.out.println("Not enough money. Please enter a higher amount.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: please enter a number.");
                input.next();
            }
        }

        int change = register.payment(pay);
        System.out.println("Change: " + change);
    }
}
