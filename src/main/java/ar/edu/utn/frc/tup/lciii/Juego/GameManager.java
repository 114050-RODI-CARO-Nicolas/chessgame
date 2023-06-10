package ar.edu.utn.frc.tup.lciii.Juego;
import ar.edu.utn.frc.tup.lciii.Juego.Match;
import ar.edu.utn.frc.tup.lciii.Juego.Movimiento;
public class GameManager {

    private static Match match=new Match();


    public static void run(){
        match.welcomeMessage();

        Player whitePlayer=match.createNewWhitePlayer();
        Player blackPlayer=match.createNewBlackPlayer();


        Boolean playAgain = true;
        Tablero tablero=new Tablero();
        Integer contador=0;
        String jugador;
        Movimiento movimiento=new Movimiento();


        // Bucle principal
        do{

            Game chessGame=new Game(whitePlayer, blackPlayer);

            Boolean keepPlaying=false;



            System.out.println("Estamos listos para el juego ciencia");

            do{
            System.out.println(tablero.getTablero());
            String pieza=chessGame.seleccionarPieza();
            String movPieza= chessGame.capturarMovimientoPieza();


            if (contador % 2 == 0) {
           jugador="blanco";
            } else {
           jugador="negro";

            }

            if(movimiento.movimientoValido(tablero.getTablero(), pieza, movPieza, jugador)){
                System.out.println("Movimiento valido");
                contador++;
            }else{
                System.out.println("Movimiento invalido, ingreselo de nuevo");
                continue;
            }
            keepPlaying=match.continuePlaying();

            }while(!chessGame.isFinish() && keepPlaying);
            //chessGame.CalcularPuntajes();
            System.out.println(chessGame.goodbyeMessage());
            playAgain=match.wantPlayAgain();


        }while(playAgain);









    }


}
