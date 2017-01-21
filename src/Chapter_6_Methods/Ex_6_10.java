package Chapter_6;
public class Ex_6_10 {
    public static void main(String[] args) {
        System.out.print("The number of prime numbers less than 1000 is: ");
        int count = 0;
        for (int i = 2; i < 1000; i++)
            if (Chapter6Methods.isPrime(i))
                count++;
        System.out.print(count + "\n");
    }
}
