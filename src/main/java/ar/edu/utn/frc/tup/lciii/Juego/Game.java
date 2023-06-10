package ar.edu.utn.frc.tup.lciii.Juego;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ar.edu.utn.frc.tup.lciii.Juego.Movimiento;


public class Game {

    Scanner scanner=new Scanner(System.in);

    private Movimiento movimiento;

    Player whitePlayer;
    Player blackPlayer;
    private Tablero tablero;



    private static final String MOVEMENT_INPUT_REGEX = "^[A-H][1-8]$";

    public Game(Player whitePlayer, Player blackPlayer){

        this.whitePlayer=whitePlayer;
        this.blackPlayer=blackPlayer;

        this.tablero=new Tablero();

    }

    public Game(){
    };




    public Boolean validarInputPieza(String inputPieza){
    Pattern pattern = Pattern.compile(MOVEMENT_INPUT_REGEX);
    Matcher matcher = pattern.matcher(inputPieza);
    return matcher.matches();
    }

    public String seleccionarPieza() {
        System.out.println("Ingresa una pieza a seleccionar con el formato A1");
        String piezaSeleccionada = null;

        while (piezaSeleccionada == null) {
            String input = scanner.nextLine();
            if (validarInputPieza(input)) {
                piezaSeleccionada = input;
            } else {
                System.out.println("Error. Ingresa de nuevo.");
            }
        }

        return piezaSeleccionada;
    }

    public String capturarMovimientoPieza() {
        System.out.println("Ingrese la casilla a donde quiere moverla con el formato A1");
        String casillaSeleccionada = null;

        while (casillaSeleccionada == null) {
            String input = scanner.nextLine();
            if (validarInputPieza(input)) {
                casillaSeleccionada = input;
            } else {
                System.out.println("Error. Ingresa de nuevo.");
            }
        }

        return casillaSeleccionada;
    };

    public Boolean validarMovimiento(String piezaSeleccionada, String casilla, String jugadorColor){
        //return movimiento.movimientoValido(this.tablero, )
        return null;
    }


    public Boolean isFinish(){
        return false;
    }

    public String goodbyeMessage(){
        return "Gracias por jugar";
    }


































}
