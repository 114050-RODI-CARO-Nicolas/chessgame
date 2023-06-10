package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.Juego.GameManager;

/**
 * Hello to TPI Chess
 *
 */
public class App
{


    /**
     * This is the main program
     * 
     */

    private static GameManager gameManager=new GameManager();
    public static void main( String[] args ) {
        System.out.println("Hello, TPI Chess.");
        gameManager.run();

    }
}
