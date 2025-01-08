package Game;

public class Game {
        private String status;
        private Player currentPlayer;
        private int moveNumber;

        private Board board;
        private MoveHistory moveHistory;

        public Game() {
        }

        public void startGame() {
        }

        public void endGame() {
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Player getCurrentPlayer() {
            return currentPlayer;
        }

        public void setCurrentPlayer(Player currentPlayer) {
            this.currentPlayer = currentPlayer;
        }

        public int getMoveNumber() {
            return moveNumber;
        }

        public void setMoveNumber(int moveNumber) {
            this.moveNumber = moveNumber;
        }

        public Board getBoard() {
            return board;
        }

        public void setBoard(Board board) {
            this.board = board;
        }

        public MoveHistory getMoveHistory() {
            return moveHistory;
        }

        public void setMoveHistory(MoveHistory moveHistory) {
            this.moveHistory = moveHistory;
        }
    }

