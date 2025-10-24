package LowLevelDesign.TicTacToe;

public class Player {
    int playerId;
    Piece piece;

    public Player(int playerId, Piece piece) {
        this.playerId = playerId;
        this.piece = piece;
    }

    public int getPlayerId() {
        return playerId;
    }

    public Piece getPiece() {
        return piece;
    }
}
