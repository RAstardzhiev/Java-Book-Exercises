package Chapter_5;
import java.util.Scanner;
public class Ex_5_1 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int nPositives = 0, nNegatives = 0, d, count = 0;
    double total = 0, avarage = 0;
    
    while (true) {
        System.out.print("Enter an integer, the input ends if it is 0: ");
        d = input.nextInt();
        
        if (d == 0)
            break;
        else if (d > 0)
            nPositives++;
        else 
            nNegatives++;
        
        count++;
        total += d;
        avarage = total / count;
    }
    
    System.out.println(count == 0 ? "No numbers are entered except 0" : "The number of positives is: " + nPositives + 
            "\nThe number of negatives is: " + nNegatives + 
            "\nThe total is: " + total + 
            "\nThe avarage is: " + avarage);
    
}    
}
