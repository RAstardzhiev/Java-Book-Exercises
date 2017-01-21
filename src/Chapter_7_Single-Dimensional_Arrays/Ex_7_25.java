package Chapter_7;
public class Ex_7_25 {
    public static void main(String[] args) {
        double abc[] = new double[3];
        System.out.print("Enter values for a, b, and c: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < abc.length; i++)
            abc[i] = input.nextDouble();
        double r[] = new double[2];
        r[0] = ((abc[1] * -1) + Math.sqrt(Math.pow(abc[1], 2) - 4 * abc[0] * abc[2])) / (2 * abc[0]);
        r[1] = ((abc[1] * -1) - Math.sqrt(Math.pow(abc[1], 2) - 4 * abc[0] * abc[2])) / (2 * abc[0]);
        switch (Methods.solveQuadratic(abc, r)) {
            case 0: System.out.println("The equation has no roots"); break;
            case 1: System.out.println("The equation has one toot " + r[0]); break;
            case 2: System.out.println("The equation has two roots " + r[0] + " and " + r[1]);
        }
    }
}
