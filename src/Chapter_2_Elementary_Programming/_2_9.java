/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author Free_CCQEB
 */
import java.util.Scanner;
public class _2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the starting velocity in meters / second: ");
        float startV = input.nextFloat();
        System.out.print("Enter the ending velocity in meters / second: ");
        float endV = input.nextFloat();
        System.out.print("Enter the time span in seconds: ");
        float time = input.nextFloat();
        
        System.out.println("The avarege acceleration is: " + (endV - startV) / time);
    }
    
}
