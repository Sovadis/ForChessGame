package Pieces;
import Game.*;

public class Pawn extends Piece {
    public Pawn(Color color, Square position) {
        super(color, position);
    }

    @Override
    public boolean validateMove(Square targetSquare) {
        return false;
    }
}