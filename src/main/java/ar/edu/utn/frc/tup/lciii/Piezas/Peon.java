package ar.edu.utn.frc.tup.lciii.Piezas;

import java.util.List;

public class Peon {//falta hacer que sólo pueda capturar en diagonal y que sólo se pueda mover verticalmente
    public boolean MovimientoCorrecto(Integer row, Integer column, Integer row_mov, Integer col_mov, String color, char[][] tablero) {

        //movimiento diagonal para capturar
        int[][] movimientoDiagonal;
        if (color.equals("blanco")) {
            movimientoDiagonal = new int[][] {{-1, -1}, {-1, 1}};  // diagonales para arriba
        } else {
            movimientoDiagonal = new int[][] {{1, -1}, {1, 1}};   // diagonales para abajo
        }
        for (int[] dir : movimientoDiagonal) {
            int r = row + dir[0];
            int c = column + dir[1];
            if (r >= 1 && r <= 8 && c >= 1 && c <= 8) {
                if (r == row_mov && c == col_mov) {
                    if (tablero[row_mov - 1][col_mov - 1] != '-') {
                        // fijarse el color de la pieza en el lugar que se quiere mover
                        char piezaDestino = tablero[row_mov - 1][col_mov - 1];
                        String colorPieza = "";
                        switch (piezaDestino) {
                            case '♟':
                                colorPieza = "blanco";
                                break;
                            case '♙':
                                colorPieza = "negro";
                                break;
                        }
                        // fijarse si la pieza en el lugar es del mismo color o del color contrario
                        if (colorPieza.equals(color)) {
                            // la pieza es del mismo color, no se puede mover ahí
                            System.out.println("La pieza que hay en esa ubicación es suya, no se puede capturar");
                            return false;
                        } else {
                            // la pieza es del color contrario, se puede mover y capturar
                            return true;
                        }
                    } else {
                        // en caso de que no haya ninguna pieza en el lugar elegido
                        System.out.println("No hay ninguna pieza para capturar en esa ubicación");
                        return false;
                    }
                }
            }
        }

        //movimento vertical para avanzar
        int [][] movimientoVertical;
        if(color.equals("blanco")){
            movimientoVertical = new int[][] {{-1, 0}};  // para arriba
        } else {
            movimientoVertical = new int[][] {{1, 0}};   // para abajo
        }
        for (int[] dir : movimientoVertical) {
            int r = row + dir[0];
            int c = column + dir[1];
            if (r >= 1 && r <= 8 && c >= 1 && c <= 8) {
                if (r == row_mov && c == col_mov) {
                    if (tablero[row_mov - 1][col_mov - 1] != '-') {
                        // fijarse el color de la pieza en el lugar que se quiere mover
                        char piezaDestino = tablero[row_mov - 1][col_mov - 1];
                        String colorPieza = "";
                        switch (piezaDestino) {
                            case '♟':
                                colorPieza = "blanco";
                                break;
                            case '♙':
                                colorPieza = "negro";
                                break;
                        }
                        // fijarse si la pieza en el lugar es del mismo color o del color contrario
                        if (colorPieza.equals(color)) {
                            // la pieza es del mismo color, no se puede mover ahí
                            System.out.println("Ya hay una pieza suya en esa ubicación");
                            return false;
                        } else {
                            // la pieza es del color contrario, no se puede mover ni capturar
                            System.out.println("Ya hay una pieza contraria en esa ubicación");
                            return false;
                        }
                    } else {
                        // en caso de que no haya ninguna pieza en el lugar elegido
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
