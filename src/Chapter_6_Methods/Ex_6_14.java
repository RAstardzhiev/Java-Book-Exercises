package Chapter_6;
public class Ex_6_14 {
    public static void main(String[] args) {
        System.out.printf("%-7s%1s\n", "i", "m(i)");
        for (int i = 0; i < 13; i++)
            System.out.print("-");
        System.out.println();
        for (int i = 1; i < 902; i += 100)
            System.out.printf("%-7d%1.4f\n", i, Chapter6Methods.ex_6_14(i));
        System.out.println();
    }
}
