package LowLevelDesign.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {

    int size;
    Piece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];
    }

    public void printBoard() {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getPieceType() + " | ");
                } else {
                    System.out.print("  | ");
                }
            }
            System.out.println();
        }
    }

    public void addPiece(int i, int j, Piece piece) {
        board[i][j] = piece;
    }

    public boolean freeCellsAvailable() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
