package Chapter_8;
public class Ex_8_36 {
    
    public static void main(String[] args) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = Integer.parseInt(console.next());
        System.out.printf("Enter %d rows of letters separated by spaces: \n", n);
        char[][] ch = new char[n][n];
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                ch[i][j] = Character.toLowerCase(console.next().charAt(0));
                if (!isInRange(ch[i][j], n)) {
                    System.out.printf("Wrong input: the letters must be from A to %c\n", '@' + n);
                    System.exit(1);
                }
            }
        }
        if (isLatinSquare(ch, n))
            System.out.println("The input array is a Latin square");
        else 
            System.out.println("WRONG - The input array is NOT a Latin square");
    }
    
    public static boolean isLatinSquare(char[][] ch, int n) {
        int r = 0;
        for (char c = 'a'; r < n; c++, r++) {
            for (int i = 0; i < ch.length; i++) {
                int rowCount = 0, colCount = 0;
                for (int j = 0; j < ch[i].length; j++) {
                    if (ch[i][j] == c) rowCount++;
                    if (ch[j][i] == c) colCount++;
                }
                if (rowCount != 1 || colCount != 1)
                    return false;
            }
        }
        return true;
    }
    
    public static boolean isInRange(char ch, int n) {
        int count = 0;
        for (char i = 'a'; count < n; i++, count++)
            if (ch == i) return true;
        return false;
    }
    
}
