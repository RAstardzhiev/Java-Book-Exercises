package Chapter_6;
public class Ex_6_27 {
    public static void main(String[] args) {
//        System.out.println(Chapter6Methods.isPrime(91));
        for (int i = 2, count = 0; count < 100; i++) {
            if (Chapter6Methods.isPalindrom(i))
                continue;
            if (Chapter6Methods.isPrime(i) && Chapter6Methods.reversePrime(i)) {
                if (count % 10 == 0)
                    System.out.println();
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
