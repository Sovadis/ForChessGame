package Pieces;
import Game.*;

public class Rook extends Piece {
    public Rook(Color color, Square position) {
        super(color, position);
    }

    @Override
    public boolean validateMove(Square targetSquare) {
        return false;
    }
}