package Chapter_5;
public class Ex_5_23_2 {
public static void main(String[] args) {
    
    double result = 1;
    
    for (double n = 5; n <= 8; n = 0.125 + n) {
        double calc  = 1.0 / n;
        result += calc;
        System.out.println("n = " + n);
    }
    System.out.println("From Right to left = " + result);
    
}    
}
