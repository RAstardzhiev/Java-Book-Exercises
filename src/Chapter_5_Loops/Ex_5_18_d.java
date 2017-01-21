package Chapter_5;
public class Ex_5_18_d {
public static void main(String[] args) {
    
    for (int i = 6; i >= 1; i--) {
        
        for (int n = 1; n <= i; n++)
            System.out.print(" " + n + " ");
        
        System.out.println();
        
        for (int s = 7 - i; s >= 1; s--)
            System.out.print("   ");
    }
    
}    
}
