package Chapter_5;
public class Ex_5_19 {
public static void main(String[] args) {
    
    for (int lines = 8; lines >= 1; lines--) {
        
        for (int space = lines; space > 1; space--)
            System.out.print("       ");
        
        int n = 1, p = 1;
        
        while (p <= 9 - lines) {
            if (n < 10)
                System.out.print("   " + n + "   ");
            else if (n > 9 && n < 100)
                System.out.print("  " + n + "   ");
            else if (n > 99)
                System.out.print(" " + n + "   ");
            n *= 2;
            p++;
        }

        n /= 2;
        
        while (n > 1) {
            n /= 2;
            if (n < 10)
                System.out.print("   " + n + "   ");
            else if (n > 9 && n < 100)
                System.out.print("  " + n + "   ");
            else if (n > 99)
                System.out.print(" " + n + "   ");
        }
        
        System.out.println();
    }
    
}    
}
