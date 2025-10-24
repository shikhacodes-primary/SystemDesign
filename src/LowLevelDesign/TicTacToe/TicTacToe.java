package LowLevelDesign.TicTacToe;

import jdk.internal.util.xml.impl.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    Deque<Player> players;
    Board board;

    public void initializeGame() {
        players = new LinkedList<>();
        int sizeOfBoard = 3;
        board = new Board(sizeOfBoard);

        Piece pieceX = new PieceX(PieceType.X);
        Piece pieceO = new PieceO(PieceType.O);
        Player player1 = new Player(1, pieceX);
        Player player2 = new Player(2, pieceO);
        players.add(player1);
        players.add(player2);
    }

    public void startGame() {
        System.out.println("Game Starts");
        board.printBoard();
        boolean winner = false;
        while (true) {
            if(!board.freeCellsAvailable()) {
                System.out.println("Game Tied!");
                return;
            }
            Player player = players.removeFirst();
            System.out.print("Player " + player.getPlayerId() + ": Please enter the cell of your piece " + player.getPiece().pieceType + ":: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] input = s.split(",");
            int inputRow = Integer.parseInt(input[0]);
            int inputCol = Integer.parseInt(input[1]);
            if (board.board[inputRow][inputCol] != null) {
                System.out.println("A piece already exists in that place. Try Again!");
                players.addFirst(player);
                continue;
            }
            board.addPiece(inputRow, inputCol, player.getPiece());
            board.printBoard();
            winner = checkWinner(inputRow, inputCol, player);
            if (winner) {
                System.out.println("Player " + player.playerId + " wins the game!");
                return;
            }
            players.addLast(player);
        }


    }

    private boolean checkWinner(int row, int col, Player player) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //check row
        for(int i=0;i<board.size;i++) {

            if(board.board[row][i] == null || board.board[row][i].pieceType != player.getPiece().pieceType) {
                rowMatch = false;
            }
        }

        //check column
        for(int i=0;i<board.size;i++) {

            if(board.board[i][col] == null || board.board[i][col].pieceType != player.getPiece().pieceType) {
                columnMatch = false;
            }
        }

        //check diagonal
        for(int i=0, j=0; i<board.size;i++,j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != player.getPiece().pieceType) {
                diagonalMatch = false;
            }
        }

        //check anti-diagonals
        for(int i=0, j=board.size-1; i<board.size;i++,j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != player.getPiece().pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}
