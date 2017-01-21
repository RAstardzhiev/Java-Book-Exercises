package Chapter_6;
public class Ex_6_29 {
    public static void main(String[] args) {
        System.out.println("Twin Primes up to 1000:");
        for (int i = 2, p = 2, count = 0; i <= 1000; i++) {
            if (Chapter6Methods.isPrime(i)) {
                if (i - 2 == p) {
                    count++;
                    System.out.println(count + ": (" + p + ", " + i + ")");
                    p = i;
                }
                else 
                    p = i;
            }
        }
    }
}
