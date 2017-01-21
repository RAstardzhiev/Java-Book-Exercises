package Chapter_7;
public class Ex_7_14 {
    public static void main(String[] args) {
        System.out.print("Enter five integers: ");
        int[] n = new int[5];
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < n.length; i++)
            n[i] = input.nextInt();
        System.out.println("The gcd is " + Methods.gcd(n));
    }
}
