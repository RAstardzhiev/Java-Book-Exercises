package Exercises;
import java.util.Scanner;
public class _2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms: ");
        double kg = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        
        System.out.println("The energy needed is: " + kg * (finalTemperature - initialTemperature) * 4184);
        
    }
    
}
