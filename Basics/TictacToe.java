import java.util.Scanner;

 class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char currentPlayer = 'X';
        boolean gameWon = false;
        int totalMoves = 0;

        Scanner scanner = new Scanner(System.in);

        while (!gameWon && totalMoves < 9) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 1 1 for top-left): ");

            int row, col;
            while (true) {
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    totalMoves++;
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            gameWon = checkWin(board, currentPlayer);

            if (!gameWon) {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        printBoard(board);
        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}
