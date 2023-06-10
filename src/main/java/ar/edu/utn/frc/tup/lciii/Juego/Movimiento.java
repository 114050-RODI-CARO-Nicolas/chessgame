package ar.edu.utn.frc.tup.lciii.Juego;

import ar.edu.utn.frc.tup.lciii.Piezas.*;

import java.util.Objects;

public class Movimiento {

    /*
    El tablero a recibir tiene que ser el tablero actual
    para saber donde estan las piezas en el momento
    en que se quiere saber el movimiento
     */
    public boolean movimientoValido(char[][] tablero, String piezaSeleccionada, String movimento, String jugador){


        // CONSIGO LA PIEZA SELECCIONADA EN EL TABLERO
        int col = piezaSeleccionada.charAt(0) - 'A';
        int row = piezaSeleccionada.charAt(1) - '1';
        char pieza = tablero[row][col];

        // CHECK PARA VER SI LA PIEZA ES VALIDA PARA EL JUGADOR ACTUAL (SUJETO A CAMBIOS)
        char[] piezasValidas;
        if (Objects.equals(jugador, "blanco")){
            piezasValidas = new char[]{'♜', '♞', '♝', '♛', '♚','♟'};
        } else if (Objects.equals(jugador, "negro")) {
            piezasValidas = new char[]{'♖', '♘', '♗', '♕', '♔', '♙'};
        }
        else {
            System.out.println("Jugador inválido");
            return false;
        }


        /*
        Qué valida? Valida que la pieza seleccionada sea igual a alguna de las piezas validas según el color del jugador.
        Usuario selecciona pieza, si es igual a la forma y al color que tiene que tener el jugador, devuelve que es correcta.
        Por eso es que le alcanza un caso verdadero.
         */
        boolean piezaCorrecta = false;
        for (int i = 0; i < piezasValidas.length; i++) {
            if (pieza == piezasValidas[i]){
                piezaCorrecta = true;
            }
        }

        // CONSIGO LA POSICION DEL MOVIMENTO SELECCIONADO EN EL TABLERO
        int colMov = movimento.charAt(0) - 'A';
        int rowMov = movimento.charAt(1) - '1';
        char mov = tablero[row][col];

        //TODO: Verificar si el movimiento es valido

        switch (pieza) {
            case '♟':
                Peon peon_b = new Peon();
                return peon_b.MovimientoCorrecto(row, col, rowMov, colMov, "blanco", tablero);
            case '♙':
                Peon peon_n = new Peon();
                return peon_n.MovimientoCorrecto(row, col, rowMov, colMov, "negro", tablero);
            case '♜':
                Torre torre_b = new Torre();
                return torre_b.MovimientoCorrecto(row, col, rowMov, colMov, "blanco", tablero);
            case '♖':
                Torre torre_n = new Torre();
                return torre_n.MovimientoCorrecto(row, col, rowMov, colMov, "negro", tablero);
            case '♞':
                Caballo caballo_b = new Caballo();
                return caballo_b.MovimientoCorrecto(row, col, rowMov, colMov, "blanco", tablero);
            case '♘':
                Caballo caballo_n = new Caballo();
                return caballo_n.MovimientoCorrecto(row, col, rowMov, colMov, "negro", tablero);
            case '♝':
                Alfil alfil_b = new Alfil();
                return alfil_b.MovimientoCorrecto(row, col, rowMov, colMov, "blanco", tablero);
            case '♗':
                Alfil alfil_n = new Alfil();
                return alfil_n.MovimientoCorrecto(row, col, rowMov, colMov, "negro", tablero);
            case '♛':
                Reina reina_b = new Reina();
                return reina_b.MovimientoCorrecto(row, col, rowMov, colMov, "blanco", tablero);
            case '♕':
                Reina reina_n = new Reina();
                return reina_n.MovimientoCorrecto(row, col, rowMov, colMov, "negro", tablero);
            case '♚':
                Rey rey_b = new Rey();
                return rey_b.MovimientoCorrecto(row, col, rowMov, colMov, "blanco", tablero);
            case '♔':
                Rey rey_n = new Rey();
                return rey_n.MovimientoCorrecto(row, col, rowMov, colMov, "negro", tablero);
        }
        return false;
    }
}

/*

Faltaría un metodo para actualice el tablero con el movimiento realizado
Empieza, le pide el mov al usuario, le envio todos los datos,
si devuelve true, y si es falso se vuelve a ejecutar para volver a pedir
 */





/*
Falta otro metodo que devuevle bool si identifica el ascii del Rey en los obstaculos
en el metodo del movimiento de la pieza (verificarJaque)
 */


