package Pieces;
import Game.*;

public class King extends Piece {
    public King(Color color, Square position) {
        super(color, position);
    }

    @Override
    public boolean validateMove(Square targetSquare) {
        return false;
    }
}