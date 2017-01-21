package Chapter_5;
public class Ex_5_33_2 {
public static void main(String[] args) {

    String perfectNumber = "";
    
    for (int i = 1; i <= 10000; i++) {
        
        int sum = 0;
        
        for (int divisor = 1; divisor <= i / 2; divisor++) {
            if (i % divisor == 0)
                sum += divisor;
        }
        
        if (sum == i)
            perfectNumber += "\n" + i;
        
    }
    
    System.out.println("All the Perfect Numbers in the range (1-10000) are: " + perfectNumber);
    
}    
}
