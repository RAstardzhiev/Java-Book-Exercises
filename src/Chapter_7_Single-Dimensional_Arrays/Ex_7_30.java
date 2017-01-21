package Chapter_7;
public class Ex_7_30 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = input.nextInt();
        int[] val = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < val.length; i++)
            val[i] = input.nextInt();
        if (Methods.isConsecutiveFour(val))
            System.out.println("The has consecutive four");
        else
            System.out.println("The has NO consecutive four");
    }
}
