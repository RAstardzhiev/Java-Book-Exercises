package Chapter_7;
public class Ex_7_5 {
    public static void main(String[] args) {
        String s = "";
        int count = 0;
        System.out.print("Enter ten numbers: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String temp = input.next();
            if (s.contains(temp))
                continue;
            s += temp + "/";
            count++;
        }
        int ar[] = new int[count];
        Methods.stringToInteger(s, ar);
        System.out.println("The number of distinct number is " + ar.length);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + " ");
    }
}
