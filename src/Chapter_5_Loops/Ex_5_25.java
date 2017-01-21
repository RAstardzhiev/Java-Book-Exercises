package Chapter_5;
public class Ex_5_25 {
public static void main(String[] args) {
    
    for (int i = 10000; i <= 100000; i += 10000) {
        
        double lup2s = Math.pow((-1), i + 1) / (2 * i - 1);
        double result = 0;
        double calc = 0;
        
        for (int k = 3; k < lup2s; k += 2) {
            calc = 1 / k;
            result += calc;
        }
        
        result += lup2s;
        
        double pi = 4 * (1 - result);
        System.out.println("π value for " + i + " = " + pi);
                
    }
    
}    
}
