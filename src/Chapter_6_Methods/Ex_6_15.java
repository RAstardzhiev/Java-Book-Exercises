package Chapter_6;
public class Ex_6_15 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.printf("%-12s%-12s%-18s%-13s%-10s\n", "Taxable", "Sihngle", "Married Joint", "Married", "Head of");
        System.out.printf("%-12s%-12s%-18s%-13s%-10s\n", "Income", "", "or Qualifying", "Separate", "a House");
        System.out.printf("%-12s%-12s%-18s\n", "", "", "Widow(er)");
        for (int i = 0; i < 62; i++)
            System.out.print("-");
        System.out.println();
        for (int i = 50000; i <= 60000; i += 50)
            System.out.printf("%-12d%-12d%-18d%-13d%-10d\n", i, Math.round(Chapter6Methods.computeTax(1, i)), Math.round(Chapter6Methods.computeTax(2, i)), Math.round(Chapter6Methods.computeTax(3, i)), Math.round(Chapter6Methods.computeTax(4, i)));
    }
}
