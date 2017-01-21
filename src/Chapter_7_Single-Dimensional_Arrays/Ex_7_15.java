package Chapter_7;
public class Ex_7_15 {
    public static void main(String[] args) {
        System.out.print("Enter ten integers: ");
        int a[] = new int[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            a[i] = input.nextInt();
        System.out.println("\nYou entered: " + java.util.Arrays.toString(a));
        a = Methods.eliminateDuplicates(a);
        System.out.println("The distinct numbers are: " + java.util.Arrays.toString(a));
    }
}
