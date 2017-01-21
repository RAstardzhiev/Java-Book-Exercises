package Chapter_6;
public class Ex_6_9 {
    public static void main(String[] args) {
        System.out.printf("%-9s%-11s|     %-11s%1s\n", "Feet", "Meters", "Meters", "Feet");
        for (int i = 0; i < 43; i++)
            System.out.print("-");
        System.out.println();
        for  (double feet = 1, meter = 20; feet <= 10; feet++, meter += 5)
            System.out.printf("%-9.2f%-11.2f|     %-11.2f%1.2f\n", feet, Chapter6Methods.footToMeter(feet), meter, Chapter6Methods.meterToFoot(meter));
    }
}
