package Chapter_7;
public class Ex_7_18 {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        double a[] = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            a[i] = input.nextDouble();
        Methods.bubbleSort(a);
        System.out.println("Starting from the Biggest one your numbers are:");
        System.out.println(java.util.Arrays.toString(a));
    }
}
