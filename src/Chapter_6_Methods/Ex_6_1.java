package Chapter_6;
public class Ex_6_1 {
    
    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers are: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0)
                System.out.printf("%-10d\n", getPentagonalNumber(i));
            else 
                System.out.printf("%-10d", getPentagonalNumber(i));
        }
    }
    
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
    
}
