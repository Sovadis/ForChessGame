package Game;

import Pieces.Piece;

public class Move {
    private Square startSquare;
    private Square endSquare;
    private Piece piece;
    private Piece capturedPiece;

    public Move(Square startSquare, Square endSquare, Piece piece) {
        this.startSquare = startSquare;
        this.endSquare = endSquare;
        this.piece = piece;
    }

    public void execute() {
    }

    public Square getStartSquare() {
        return startSquare;
    }

    public void setStartSquare(Square startSquare) {
        this.startSquare = startSquare;
    }

    public Square getEndSquare() {
        return endSquare;
    }

    public void setEndSquare(Square endSquare) {
        this.endSquare = endSquare;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getCapturedPiece() {
        return capturedPiece;
    }

    public void setCapturedPiece(Piece capturedPiece) {
        this.capturedPiece = capturedPiece;
    }
}