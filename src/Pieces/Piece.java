package Pieces;
import Game.*;

public abstract class Piece {
    protected Color color;
    protected Square position;
    protected boolean hasMoved;

    public Piece(Color color, Square position) {
        this.color = color;
        this.position = position;
        this.hasMoved = false;
    }

    public abstract boolean validateMove(Square targetSquare);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Square getPosition() {
        return position;
    }

    public void setPosition(Square position) {
        this.position = position;
    }

    public boolean isHasMoved() {
        return hasMoved;
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }
}