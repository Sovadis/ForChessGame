package Pieces;
import Game.*;

public class Queen extends Piece {
    public Queen(Color color, Square position) {
        super(color, position);
    }

    @Override
    public boolean validateMove(Square targetSquare) {
        return false;
    }
}