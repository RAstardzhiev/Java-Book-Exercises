package Chapter_8;
public class Ex_8_17 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of banks: ");
        int numberOfBanks = input.nextInt();
        System.out.print("Enter a value for Minimum Limit: ");
        int limit = input.nextInt();
        
        int[][] banks = new int[numberOfBanks][];
        
        for (int i = 0; i < banks.length; i++) {
            String theRow = "";
            System.out.print("Enter the Balance of Bank " + i + ": ");
            theRow += input.next() + "/";
            
            System.out.print("Enter the number of banks that borrowed money from bank " + i + ": ");
            theRow += input.next() + "/";
            
            int columns = 2;
            int lns = Integer.parseInt(theRow.substring(theRow.lastIndexOf("/", theRow.length() - 2) + 1, theRow.lastIndexOf("/")));
            for (int h = 0; h < lns; h++, columns += 2) {
                System.out.print("\t Loan " + (h + 1) + ": Enter to which Bank is the Loan: ");
                theRow += input.next() + "/";
                System.out.print("\t\t-Enter the amount of " + theRow.substring(theRow.lastIndexOf("/", theRow.length() - 2) + 1, theRow.lastIndexOf("/")) + "'s Loan: ");
                theRow += input.next() + "/";
            }
            stringToSubArray(banks, i, columns, theRow);
        }
        checkStability(banks, limit);
    }
    
    public static void stringToSubArray(int[][] a, int index, int columns, String s) {
        a[index] = new int[columns];
        for (int i = 0; i < columns; i++) {
            a[index][i] = Integer.parseInt(s.substring(0, s.indexOf("/")));
            if (s.indexOf("/") > 0)
                s = s.substring(s.indexOf("/") + 1);
        }
    }
    
    public static void checkStability(int[][] a, int limit) {
        String unsafeBanks = "";
        for (int i = 0; i < a.length; i++) {
            int assets = a[i][0];
            for (int j = 3; j < a[i].length; j += 2)
                assets += a[i][j];
            if (assets < limit && !unsafeBanks.contains("" + i)) {
                    unsafeBanks += "Bank " + i + " ";
                    for (int anew = 0; anew < a.length; anew++) {
                        for (int reset = 3; reset < a[anew].length; reset += 2) {
                            if (a[anew][reset - 1] == i)
                                a[anew][reset] = 0;
                        }
                    }
                    i = 0;
            }  
        }
        if (unsafeBanks.length() == 1)
            System.out.println("\nThe Unstable Bank is " + unsafeBanks);
        else
            System.out.println(unsafeBanks.length() > 0 ? "\nUnsafe banks are " + unsafeBanks : "\nAll the banks are Stable and Safe");
    }
    
}
