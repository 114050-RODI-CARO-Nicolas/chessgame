package ar.edu.utn.frc.tup.lciii.MenuManager;


import java.util.Scanner;

public class GamesMenu {

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("Games Menu");
            System.out.println("1. New game");
            System.out.println("2. Load a started game");
            System.out.println("3. Go back to previous menu");

            int choice = readIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    System.out.println("Creating new game...");
                    //GameManager.createGame(); llamada a capa de manejo de juego para iniciar flujo
                    break;
                case 2:
                    System.out.println("Loading started game...");
                    break;
                case 3:
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

    private String readStringInput(String message){
        System.out.print(message);
        String input=scanner.next();
        scanner.nextLine();
        return input;



    }









}