package Game;

import java.util.ArrayList;
import java.util.List;

public class MoveHistory {
    private List<Move> moves;

    public MoveHistory() {
        this.moves = new ArrayList<>();
    }

    public void addMove(Move m) {
        moves.add(m);
    }

    public List<Move> getMoves() {
        return moves;
    }
}
