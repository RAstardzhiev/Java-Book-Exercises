package Chapter_4;
import java.util.Scanner;
public class Ex_4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter point 1 (latitude and logitude) in degrees: ");
        double p1Lat = input.nextDouble();
        double p1Log = input.nextDouble();
        
        System.out.print("Enter point 2 (latitude and logitude) in degrees: ");
        double p2Lat = input.nextDouble();
        double p2Log = input.nextDouble();
        
        //Converting the input in Radians
        double x1 = Math.toRadians(p1Lat);
        double y1 = Math.toRadians(p1Log);
        double x2 = Math.toRadians(p2Lat);
        double y2 = Math.toRadians(p2Log);
        
        // Creating the Earth Radius --> Given from the book
        double r = 6371.01;
        
        // The Fucki'n Formula
        double d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        
        System.out.println("The distance between the two points is: " + d + " km");
        
        // Formated or Rounded result
        System.out.printf("Formated or Rounded result: %1.2f", d);
        System.out.println(" km");
        
    }
}
