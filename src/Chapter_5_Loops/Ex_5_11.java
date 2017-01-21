package Chapter_5;
public class Ex_5_11 {
public static void main(String[] args) {
    
    int line = 0;
    
    for (int count = 100; count <= 200; count++) {
        if (count % 5 == 0 || count % 6 == 0) {
                if (line == 10) {
                    line = 0;
                    System.out.println();
                }
            System.out.print(" " + count);
            line++;
        }
    }
    
    System.out.println();
    
}    
}
