package Exercises;
import java.util.Scanner;
public class _2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of years: ");
        double enteredYears = input.nextDouble();
        
        double currentPopulation = 312032486;
        double births = 10512000 / 7.0;
        double deaths = 10512000 / 13.0;
        double emigrants = 10512000 / 45.0;
        
        System.out.println("The population in " + enteredYears + " years is: " + (int)(enteredYears * (births + emigrants - deaths) + currentPopulation));
        

        
    }
    
}
