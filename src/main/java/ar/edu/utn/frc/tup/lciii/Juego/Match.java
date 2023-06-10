package ar.edu.utn.frc.tup.lciii.Juego;
import ar.edu.utn.frc.tup.lciii.Juego.Player;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {

private static final String YES_NO_REGEX = "[yYnN]";


Scanner scanner=new Scanner(System.in);

    public void welcomeMessage(){
        System.out.println("Bienvenido al ajedrez");

    }

    public Player createNewWhitePlayer(){
        Player player=new Player();
        System.out.println("JUGADOR BLANCO: Ingrese su nombre para empezar a jugar");
        player.setNombre(scanner.nextLine());
        player.setColor("blanco");
        return player;
    }

    public Player createNewBlackPlayer(){
        Player player=new Player();
        System.out.println("JUGADOR NEGRO: Ingrese su nombre para empezar a jugar");
        player.setNombre(scanner.nextLine());
        player.setColor("negro");
        return player;
    }



    private static Boolean getYesNoAnswer(String input) {
        Pattern pattern = Pattern.compile(YES_NO_REGEX);
        Boolean answer = null;
        if (pattern.matcher(input).matches()) {
            if(input.toLowerCase().equals("y")) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            System.out.println("La opción ingresada no es valida.");
        }
        return answer;
    }

    public Boolean wantPlayAgain() {
        Boolean answer = null;
        do {
            System.out.println("¿Quieres volver a jugar? (y/n)");
            String input = scanner.nextLine();
            answer = getYesNoAnswer(input);
        } while (answer == null);
        return answer;
    }

    public Boolean continuePlaying() {
        Boolean answer = null;
        do {
            System.out.println("¿Quieres continuar la partida? (y/n)");
            String input = scanner.nextLine();
            answer = getYesNoAnswer(input);
        } while (answer == null);
        return answer;
    }

}











