package Chapter_7;
public class Ex_7_28 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = input.nextInt();
        System.out.println("All possible combinations are: ");
        for (int i = 0; i < a.length; i++) {
            for (int n = i + 1; n < a.length; n++)
                System.out.print("|| " + a[i] + " + " + a[n] + " ||");
            System.out.println();
        }
    }
}
