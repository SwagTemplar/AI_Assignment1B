import java.util.Scanner;

public class tictactoe {
    //Scalable
    public int rows;
    public int cols;


    // Create a 2D array to represent the board
    private char[][] board;
    
    // Create a variable to keep track of whose turn it is
    private char currentPlayer = 'X';
    
    // Create a scanner object to read input
    private Scanner scanner = new Scanner(System.in);
    
    public tictactoe(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        this.board = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.board[i][j] = ' ';
            }
        }
    }

    public void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
    // public void play() {
    //     // Print the initial board
    //     printBoard();
        
    //     // Loop until the game is over
    //     while (!isGameOver()) {
    //         // Get the current player's move
    //         int[] move = getPlayerMove();
    //         int row = move[0];
    //         int col = move[1];
            
    //         // Update the board with the current player's move
    //         board[row][col] = currentPlayer;
            
    //         // Switch to the other player
    //         currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            
    //         // Print the updated board
    //         printBoard();
    //     }
        
    //     // Print the final result
    //     if (hasWinner()) {
    //         System.out.println("Player " + currentPlayer + " wins!");
    //     } else {
    //         System.out.println("Draw!");
    //     }
    // }
    
    // private boolean isGameOver() {
    //     // The game is over if there is a winner or the board is full
    //     return hasWinner() || isBoardFull();
    // }
    
    // private boolean isBoardFull() {
    //     // The board is full if there are no empty spaces
    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //             if (board[i][j] == ' ') {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    
    private boolean hasWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return true;
        }
        
        return false;
    }
    
    // private int[] getPlayerMove() {
    //     int[] move = new int[2];
    //     boolean validInput = false;
    //     while (!validInput) {
    //         System.out.print("Player " + currentPlayer + ", enter");
    //     }
    // }
}