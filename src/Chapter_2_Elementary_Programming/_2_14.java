package Exercises;
import java.util.Scanner;
public class _2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double inches = input.nextDouble();
        
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        System.out.println("Your BMI is: " + (int)(kilograms / Math.pow(meters, 2) * 100) / 100.0);
        
        // --> My madness
        System.out.println("");
        double poundsFormula = kilograms / 0.45359237;
        System.out.println("Pounds formula = " + poundsFormula);

        double inchesFormula = meters / 0.0254;
        System.out.println("Inches formula = " + inchesFormula);
        // <-- My madness
    }
    
}
