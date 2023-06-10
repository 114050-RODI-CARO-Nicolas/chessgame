package ar.edu.utn.frc.tup.lciii.Piezas;

public class Caballo {
    public boolean MovimientoCorrecto(Integer row, Integer col, Integer row_mov, Integer col_mov, String color, char[][] tablero) {
        int[][] movimiento = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        for (int[] dir : movimiento) {
            int r = row + dir[0];
            int c = col + dir[1];
            while (r >= 1 && r <= 8 && c >= 1 && c <= 8) {
                if (r == row_mov && c == col_mov) {
                    if (tablero[row_mov - 1][col_mov - 1] != '-') {
                        // fijarse el color de la pieza en el lugar que se quiere mover
                        char piezaDestino = tablero[row_mov - 1][col_mov - 1];
                        String colorPieza="";
                        switch (piezaDestino){
                            case '♞':
                                colorPieza="blanco";
                                break;
                            case '♘':
                                colorPieza="negro";
                                break;
                        }
                        // fijarse si la pieza en el lugar es del mismo color o del color contrario
                        if (colorPieza.equals(color)) {
                            // la pieza es del mismo color, no se puede mover ahí
                            System.out.println("Ya hay una pieza suya en esa ubicación");
                            return false;
                        } else {
                            // la pieza es del color contrario, se puede mover y capturar
                            return true;
                        }
                    }
                    else {
                        // en caso de que no haya ninguna pieza en el lugar elegido
                        return true;
                    }
                }
                r += dir[0];
                c += dir[1];
            }
        }
        return false;
    }
}
