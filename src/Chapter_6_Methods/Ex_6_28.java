package Chapter_6;
public class Ex_6_28 {
    public static void main(String[] args) {
//        System.out.println(Chapter6Methods.isPrime(28));
        System.out.printf("%-6s%-6s\n", "P", "2^p-1");
        System.out.println("------------");
        for (int i = 2; i <= 31; i++) {
            if (Chapter6Methods.mersennePrime(i)) {
                System.out.printf("%-6d%1d\n", i, Math.round(Math.pow(2, i) - 1));
//                System.out.print(Math.round(Math.pow(2, i) - 1) + "\n");
            }
        }
    }
}
