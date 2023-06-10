package ar.edu.utn.frc.tup.lciii.MenuManager;

import java.util.Scanner;

public class PlayersMenu {

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("Players Menu");
            System.out.println("1. Create a new player");
            System.out.println("2. List all players");
            System.out.println("3. Update a player");
            System.out.println("4. Delete a player");
            System.out.println("5. Go back to previous menu");

            int choice = readIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    System.out.println("Creating new player...");
                    break;
                case 2:
                    System.out.println("Listing all players...");
                    break;
                case 3:
                    System.out.println("Updating player...");
                    break;
                case 4:
                    System.out.println("Deleting player...");
                    break;
                case 5:
                    System.out.println("Going back to previous menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private int readIntInput(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. " + message);
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        return input;
    }
}