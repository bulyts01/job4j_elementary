package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean rsl = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][column] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 'X') && (monoVertical(board, i) || monoHorizontal(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
