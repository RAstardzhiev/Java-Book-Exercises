package Chapter_7;
public class Ex_7_7 {
    public static void main(String[] args) {
        int[] a = new int[100];
        Methods.randomIntegers(a);
//        System.out.println(java.util.Arrays.toString(a));
        int count[] = new int[10];
        Methods.countIntegers(a, count);
        System.out.println("This program generated 100 (between 0 and 9) random integers as follows: ");
        for (int i = 0; i < count.length; i++)
            System.out.println("\t- Digit " + i + " was generated " + count[i] + " times");
    }
}
