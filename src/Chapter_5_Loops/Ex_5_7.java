package Chapter_5;
public class Ex_5_7 {
public static void main(String[] args) {
    
    int year;
    double tuition = 10000;
    
    for (year = 0; year < 10; year++, tuition *= 1.05) {
        if (year == 4)
            System.out.printf("Tuition for " + year + " Years would be: %1.2f\n", tuition);
    }
    
    System.out.printf("Tuition for " + year + " Years would be: %1.2f\n", tuition);
    
}    
}
