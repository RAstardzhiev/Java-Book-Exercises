package Chapter_7;
public class Ex_7_12 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        double d[] = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < d.length; i++) 
            d[i] = input.nextDouble();
        System.out.println("\nYou entered\n" + java.util.Arrays.toString(d));
        System.out.print("\n\nYour numbers inversed are\n[");
        Methods.reverseDoubleArray(d);
        for (int i = 0; i < d.length; i++) {
            if (i == d.length - 1)
                System.out.print(d[i] + "]");
            else 
                System.out.print(d[i] + ", ");
        }
        System.out.println();
    }
}
