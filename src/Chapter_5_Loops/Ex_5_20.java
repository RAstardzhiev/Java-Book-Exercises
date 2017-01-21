package Chapter_5;
public class Ex_5_20 {
public static void main(String[] args) {
    
    System.out.println("First 1000 prime numbers are: ");
    
    int line = 1;
    
    for (int n = 2; n <= 1000; n++) {
        
        if (line > 8) {
            System.out.println();
            line = 1;
        }
        
        boolean ch = true;
        
        for (int divisor = 2; divisor <= n / 2; divisor++) {
            if(n % divisor == 0) {
                ch = false;
                break;
            }
            }
        
        if (ch) {
                System.out.print(n + " ");
                line++;
        }
                
    }
    System.out.println();
}    
}
