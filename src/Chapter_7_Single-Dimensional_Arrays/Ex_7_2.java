package Chapter_7;
public class Ex_7_2 {
    public static void main(String[] args) {
        int[] n = new int[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten integers separated by space: ");
        for (int i = 0; i < 10; i++)
            n[i] = input.nextInt();
        Methods.intArrayInverse(n);
        Methods.printIntArray(n);
    }
}
