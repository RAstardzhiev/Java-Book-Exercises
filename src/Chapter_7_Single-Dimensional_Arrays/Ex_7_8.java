package Chapter_7;
public class Ex_7_8 {
    public static void main(String[] args) {
        System.out.print("Enter 10 values to see their average: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        double d[] = new double[10];
        for (int i = 0; i < d.length; i++)
            d[i] = input.nextDouble();
        System.out.println("You entered \n" + java.util.Arrays.toString(d));
        System.out.println("\nAnd their average is " + Methods.average(d));
    }
}
