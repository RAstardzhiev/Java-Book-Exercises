package Chapter_3;
import java.util.Scanner;
public class _3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an year: ");
        int year = input.nextInt();
        System.out.print("Enter a month e.g.(1-12): ");
        int m = input.nextInt();
        System.out.print("Enter a day of the month e.g.(1-31): ");
        int q = input.nextInt();
        
        if (m == 1) {
            m = 13;
            year = --year; 
        }
        if (m == 2) {
            m = 14;
            year = --year;
        }
        
        int j = (int)(year / 100);
        int k = year % 100;
        int h = (int)(q + 26 * (m + 1) / 10.0 + k + k / 4.0 + j / 4 + 5 * j) % 7;
        
        switch (h) {
            case 0: System.out.println("Day of the week is Saturday"); break;
            case 1: System.out.println("Day of the week is Sunday"); break;
            case 2: System.out.println("Day of the week is Monday"); break;
            case 3: System.out.println("Day of the week is Tuesday"); break;
            case 4: System.out.println("Day of the week is Wednesday"); break;
            case 5: System.out.println("Day of the week is Thursday"); break;
            case 6: System.out.println("Day of the week is Friday"); break;
            default: System.out.println("WRONG RESULT - Call the support to fix the problem");
        }
        //Check Point for --year
        //System.out.println("Year = " + year);
    }
    
}
