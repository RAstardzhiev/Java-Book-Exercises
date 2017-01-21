package Chapter_8;
public class Ex_8_20 {
    
    public static void main(String[] args) {
        System.out.println("\t*** GAME ***\tConnect Four ***\n");
        char[][] board = new char[6][7];
//        System.out.println(java.util.Arrays.toString(board[0]));
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        int player = 1;
        
        while (true) {
            printBoard(board);
            // Check for Winner
            if (winner(board, player)) break;
            player++;
            
            if (isFull(board)) {
                System.out.println("\nDRAW - No one wins\n");
                break;
            }
// User input
            int drop = -1;
            while (true) {
                while (true) {
                    if (player % 2 == 0) {
                        System.out.print("Player Red: Drop a red disc at column (0-6): ");
                        drop = input.nextInt();

                    }
                    else {
                        System.out.print("Player Yellow: Drop a yellow disc at column (0-6): ");
                        drop = input.nextInt();

                    }
                    if (drop >= 0 && drop <= 6) break;
                    else System.out.println("Wrong column. Try again");
                }
                int check = columnPlace(board, drop);
                if (check >= 0) {
                    if (player % 2 == 0) board[check][drop] = 'R';
                    else board[check][drop] = 'Y';
                    break;
                }
                else System.out.println("This column is already Full. Try again");
            }
        }
    }
    
    public static void printBoard(char ch[][]) {
        for (int i = 0; i < ch.length; i++) {
            System.out.print("|");
            for (int j = 0; j < ch[i].length; j++) {
                if (ch[i][j] == 0)
                    System.out.print("   |");
                else 
                    System.out.print(" " + ch[i][j] + " |");
            }
            System.out.println();
        }
        for (int i = 0; i <= 28; i++)
            System.out.print("-");
        System.out.println();
    }
    
    public static boolean isFull(char[][] ch) {
        for (int i = 0; i < ch.length; i++) 
            for (int j = 0; j < ch[i].length; j++)
                if (ch[i][j] == 0) return false;
        return true;
    }
    
    public static int columnPlace(char[][] ch, int column) {
        for (int i = ch.length - 1; i >= 0; i--)
            if (ch[i][column] == 0) return i;
        return -1;
    }
    
    public static boolean winner(char[][] ch, int key) {
        char k;
        String winner;
        if (key % 2 == 0) {
            k = 'R';
            winner = "Red";
        }
        else {
            k = 'Y';
            winner = "Yellow";
        }
        int cons = 0;
// Horizontal
        for (int i = 0; i < ch.length; i++) {
            cons = 0;
            for (int j = 0; j < ch[i].length; j++) {
                if (ch[i][j] == k) cons++;
                else cons = 0;
                if (cons == 4)  {
                    System.out.println("The *** " + winner + " *** player won");
                    return true;
                }
            }
        }
// Vertical
        cons = 0;
        for (int j = 0; j < ch[0].length; j++) {
            cons = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i][j] == k) cons++;
                else cons = 0;
                if (cons == 4) {
                    System.out.println("The *** " + winner + " *** player won");
                    return true;
                }
            }
        }
// Main Diagonal
        cons = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                cons = 0;
                for (int r = i, c = j; r < ch.length && c < ch[r].length; r++, c++) {
                    if (ch[r][c] == k) cons++;
                    else cons = 0;
                    if (cons == 4) {
                        System.out.println("The *** " + winner + " *** player won");
                        return true;
                    }
                }
            }
        }
// Sub Diagonal
        cons = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                cons = 0;
                for (int r = i, c = j; r < ch.length && c >= 0; r++, c--) {
                    if (ch[r][c] == k) cons++;
                    else cons = 0;
                    if (cons == 4) {
                        System.out.println("The *** " + winner + " *** player won");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}
