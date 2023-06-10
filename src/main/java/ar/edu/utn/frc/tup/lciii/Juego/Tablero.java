package ar.edu.utn.frc.tup.lciii.Juego;
public class Tablero
{
    int filasTablero = 8;
    int columnasTablero = 8;
    char[][] tablero;

    public Tablero() {
        this.tablero = new char[filasTablero][columnasTablero];
    }

    public int getFilasTablero() {
        return filasTablero;
    }

    public void setFilasTablero(int filasTablero) {
        this.filasTablero = filasTablero;
    }

    public int getColumnasTablero() {
        return columnasTablero;
    }

    public void setColumnasTablero(int columnasTablero) {
        this.columnasTablero = columnasTablero;
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public void TableroInicial() {
        for (int fila = 0; fila < filasTablero; fila++) {
            for (int columna = 0; columna < columnasTablero; columna++) {
                tablero[fila][columna] = ' ';
            }
        }

        //Fichas Negras
        // Torre negra izquierda
        tablero[0][0] = '♜';
        // Torre negra derecha
        tablero[0][7] = '♜';
        // Caballo negro izquierda
        tablero[0][1] = '♞';
        // Caballo negro derecha
        tablero[0][6] = '♞';
        // Alfil negro izquierda
        tablero[0][2] = '♝';
        // Alfil negro derecha
        tablero[0][5] = '♝';
        // Reina negra izquierda
        tablero[0][3] = '♛';
        // Rey negro derecha
        tablero[0][4] = '♚';

        //Fichas Blancas
        // Torre blanca izquierda
        tablero[7][0] = '♖';
        // Torre blanca derecha
        tablero[7][7] = '♖';
        // Caballo blanco izquierda
        tablero[7][1] = '♘';
        // Caballo blanco derecha
        tablero[7][6] = '♘';
        // Alfil blanco izquierda
        tablero[7][2] = '♗';
        // Alfil blanco derecha
        tablero[7][5] = '♗';
        // Reina blanca izquierda
        tablero[7][3] = '♕';
        // Rey blanco derecha
        tablero[7][4] = '♔';

        for (int i = 0; i < filasTablero; i++) { ///o <columnasTablero, mismo valor
            tablero[1][i] = '♟'; // Peones negros
            tablero[6][i] = '♙'; // Peones blancos
        }

        // Letras
        char[] letrasColumnas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        System.out.print("  ");
        for (int i = 0; i < columnasTablero; i++) {
            System.out.print(" " + letrasColumnas[i] + " ");
        }
        System.out.println();

        for (int fila = filasTablero - 1; fila >= 0; fila--) {
            System.out.print((fila + 1) + " ");
            for (int columna = 0; columna < columnasTablero; columna++) {
                System.out.print(" " + tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }


    /*
    TODO:
    Metodo que reciba parametros, actualiza tablero y persiste.
     */
    public void actualizarTablero(String pieza, String mov){




    }
























}








