package Chapter_8;
public class Ex_8_11 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 511: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        String s = Integer.toBinaryString(n);
// System.out.println(s);
        while (true) {
            if (s.length() >= 9)
                break;
            s = 0 + s;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 == 0) System.out.println();
            if (s.charAt(i) == '0')
                System.out.print("H");
            else 
                System.out.print("T");
        }
        System.out.println();
    }
}
