package Chapter_6;
public class Ex_6_16 {
    public static void main(String[] arg) {
        System.out.printf("\n\n%-10s%1s\n", "Year", "№ of days");
        System.out.print("--------------------\n");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%-10d%1d\n", i, Chapter6Methods.numberOfDaysInAYear(i));
            System.out.print("--------------------\n");
        }
    }
}
