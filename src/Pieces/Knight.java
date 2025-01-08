package Pieces;
import Game.*;

public class Knight extends Piece {
    public Knight(Color color, Square position) {
        super(color, position);
    }

    @Override
    public boolean validateMove(Square targetSquare) {
        return false;
    }
}