package ar.edu.utn.frc.tup.lciii.MenuManager;

import java.util.Scanner;

public class ConsoleMenu {
    private Scanner scanner = new Scanner(System.in);
    private GamesMenu gamesMenu = new GamesMenu();
    private PlayersMenu playersMenu = new PlayersMenu();

    public void run() {
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Games");
            System.out.println("2. Players");
            System.out.println("3. Exit");

            int choice = readIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    gamesMenu.run();
                    break;
                case 2:
                    playersMenu.run();
                    break;
                case 3:
                    System.out.println("Goodbye!");
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
