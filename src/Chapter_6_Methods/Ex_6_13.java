package Chapter_6;
public class Ex_6_13 {
    public static void main(String[] args) {
        System.out.printf("%-7s%1s\n", "i", "m(i)");
        for (int i = 0; i < 13; i++)
            System.out.print("-");
        System.out.println();
        for (int i = 1; i <= 20; i++)
            System.out.printf("%-7d%1.4f\n", i, Chapter6Methods.mi_6_13(i));
        System.out.println();
    }
}
