package Chapter_6;
public class Ex_6_26 {
    public static void main(String[] args) {
//        System.out.println(Chapter6Methods.isPalindrom(1561));
//        System.out.println(Chapter6Methods.isPalindrom(16561));

        for (int i = 2, count = 0; count < 100; i++) {
            if (Chapter6Methods.isPalindrom(i) && Chapter6Methods.isPrime(i)) {
                if (count % 10 == 0)
                    System.out.println();
                System.out.print(i + " ");
                count++;
            }
        }

    }
}
