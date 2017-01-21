package Chapter_5;
public class Ex_5_15 {
    public static void main(String[] args) {
        int line = 1;
        for (int count = 33; count <= 126; count++) {
            System.out.print(" " + (char)(count)); 
            if (line == 10) {
                line = 0;
                System.out.println();
            }
            line++;
        }
System.out.println();
    }
}
