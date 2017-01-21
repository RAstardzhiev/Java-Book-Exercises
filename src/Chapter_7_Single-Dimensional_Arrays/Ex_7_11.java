package Chapter_7;
public class Ex_7_11 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        double d[] = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < d.length; i++)
            d[i] = input.nextDouble();
        System.out.printf("The mean is %1.2f\n", Methods.mean(d));
        System.out.printf("The standard deviation is %1.5f\n", Methods.deviation(d));
        
    }
}
