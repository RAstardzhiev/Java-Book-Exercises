package Chapter_8;
public class Ex_8_9 {
    public static void main(String[] args) {
        System.out.println("\t*** GAME *** Tic-Tac-Toe ***");
        
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = "   |";
        int iteration = 0;
        while (true) {
            iteration++;
            printBoard(board);
            boolean con = false;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j].contains("   |")) {
                        con = true;
                        break;
                    }
                }
                if (con) break;
            }
            if (!con) {
                System.out.println("DRAW - No one Wins");
                break;
            }
            if (winnerCheck(board))
                break;
            else 
                interference(board, iteration);
        }
    }
    
    
    public static void printBoard(String[][] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println("\n-------------");
            System.out.print("|");
            for (int j = 0; j < s[i].length; j++)
                System.out.print(s[i][j]);
        }
        System.out.println("\n-------------");
    }
    
    public static boolean winnerCheck(String[][] s) {
        for (int i = 0; i < s.length; i++) {
            int cx = 0, co = 0, cdx = 0, cdo = 0;
            for (int j = 0; j < s[i].length; j++) {
                if (s[i][j].contains("X"))
                    cx++;
                else if (s[i][j].contains("O"))
                    co++;
                if (s[j][i].contains("X"))
                    cdx++;
                else if (s[j][i].contains("X"))
                    cdo++;
            }
            if (cx == 3 || cdx == 3 || s[0][0].contains("X") && s[1][1].contains("X") && s[2][2].contains("X") || s[0][2].contains("X") && s[1][1].contains("X") && s[2][0].contains("X")) {
                System.out.println("\n*** The WINNER is *** Player X ***");
                return true;
            }
            else if (co == 3 || cdo == 3 || s[0][0].contains("O") && s[1][1].contains("O") && s[2][2].contains("O") || s[0][2].contains("O") && s[1][1].contains("O") && s[2][0].contains("O")) {
                System.out.println("\n*** The WINNER is *** Player O ***");
                return true;
            }
        }
        return false;
    }
    
        public static void interference(String[][] s, int it) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String player = (it % 2 == 0) ? "X" : "O";
        while (true) {
            System.out.print("Enter a Row (0, 1, or 2) for player " + player + ": ");
            int row = input.nextInt();
            System.out.print("Enter a Column (0, 1, or 2) for player " + player + ": ");
            int column = input.nextInt();
            if (s[row][column].contains("X") || s[row][column].contains("O"))
                System.out.println("This square is already used. Try again");
            else if (row >= 0 && row <3 && column >= 0 && column < 3) {
                s[row][column] = " " + player + " |";
                break;
            }
            else 
                System.out.println("Wrong input. Try again");
        }
    }
    
}
