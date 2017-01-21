package Chapter_5;
public class Ex_5_24 {
public static void main(String[] args) {
    
    double sum = 0;
    
    for (double d = 97, o = 99; d >= 1; d -= 2, o -= 2) {
        double calc = d / o;
        sum += calc;
    }
    
    System.out.println("The SUM is: " + sum);
    
}    
}
