package Pieces;
import Game.*;



public class Bishop extends Piece {
    public Bishop(Color color, Square position) {
        super(color, position);
    }

    @Override
    public boolean validateMove(Square targetSquare) {
        return false;
    }
}