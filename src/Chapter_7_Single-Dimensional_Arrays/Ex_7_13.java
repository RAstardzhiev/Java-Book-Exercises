package Chapter_7;
public class Ex_7_13 {
    public static void main(String[] args) {
        System.out.println("This program will generate a random number between 1 and 54");
        System.out.print("Enter numbers to be excluded from the result (for finish enter zero 0): ");
        int count = 0;
        String s = "";
        java.util.Scanner input = new java.util.Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            if (n == 0)
                break;
            s += n + "/";
            count++;
        }
        int[] a = new int[count];
        Methods.stringToInteger(s, a);
        System.out.println("\nThe random number is " + Methods.getRandom(a));
    }
}
