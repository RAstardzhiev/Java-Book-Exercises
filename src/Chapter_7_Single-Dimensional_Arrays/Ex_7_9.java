package Chapter_7;
public class Ex_7_9 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        double d[] = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < d.length; i++)
            d[i] = input.nextDouble();
        System.out.println("\nYou entered \n" + java.util.Arrays.toString(d));
        System.out.println("\nThe minimum number is " + Methods.min(d));
    }
}
