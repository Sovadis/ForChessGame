package Game;

import Pieces.Piece;

public class Square {
    private int row;
    private int col;
    private Piece piece;

    public Square(int row, int col) {
        this.row = row;
        this.col = col;
        this.piece = null;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}