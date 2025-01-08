package Game;

public class Board {
    private Square[][] squares = new Square[8][8];

    public Board() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                squares[row][col] = new Square(row, col);
            }
        }
    }

    public void displayBoard() {
    }

    public Square getSquare(int row, int col) {
        if (row < 0 || row >= 8 || col < 0 || col >= 8) {
            return null;
        }
        return squares[row][col];
    }
}