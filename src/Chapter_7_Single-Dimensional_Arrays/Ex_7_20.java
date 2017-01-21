package Chapter_7;
public class Ex_7_20 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        double a[] = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            a[i] = input.nextDouble();
        System.out.println("\nYou entered\n" + java.util.Arrays.toString(a));
        Methods.selectionSort(a);
        System.out.println("\nYour numbers sorted are\n" + java.util.Arrays.toString(a));
    }
}
