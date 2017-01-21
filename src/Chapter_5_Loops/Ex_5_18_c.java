package Chapter_5;
public class Ex_5_18_c {
public static void main(String[] args) {
    
    for (int f = 6; f >= 1; f--) {
        
        for (int i = 1; i < f; i++)
            System.out.print("   ");
        
        for (int c = 7 - f; c >= 1; c--)
            System.out.print(" " + c + " ");
        
        System.out.println();
    }
        
}    
}
