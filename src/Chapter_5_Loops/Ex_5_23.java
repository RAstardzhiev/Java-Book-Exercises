package Chapter_5;
public class Ex_5_23 {
public static void main(String[] args) {
    
    double result = 1;
    
    for (int n = 2; n <= 50000; n++) {
        double calc  = 1.0 / n;
        result += calc;
    }
    System.out.println("From Left to Right = " + result);
    
    result = 1;
    
    for (int n = 50000; n >= 2; n--) {
        double calc = 1.0 / n;
        result += calc;
    }
    System.out.println("From Right to left = " + result);
    
}    
}
