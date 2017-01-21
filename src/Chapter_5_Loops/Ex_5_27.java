package Chapter_5;
public class Ex_5_27 {
public static void main(String[] args) {
    
    int y = 101, numberOfLeapYears = 0, line = 0;
    
    while (y <= 2100) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.print(y + " ");
            numberOfLeapYears++;
            line++;
        }
        y++;
        if (line == 10) {
            System.out.println();
            line = 0;
        }
    }
    
    System.out.println("\nIn the peiod between 101 - 2100 year there are " + numberOfLeapYears + " Leap Years");
    
}    
}
