package Chapter_3;
import java.util.Scanner;
public class _3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();
        
        double windChillTemperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        
        if (temperature >= -58 && temperature <= 41 && windSpeed >= 2)
            System.out.println("The wind-chill temperature is: " + windChillTemperature);
        else if (temperature < -58 || temperature > 41 && windSpeed >= 2)
            System.out.println("You entered WRONG temperature. It must be between -58F and 41F");
        else if (temperature < -58 || temperature > 41 && windSpeed < 2)
            System.out.println("You entered WRONG temperature and wind speed. The temperature must be between -58F and 41F and the wind speed must be greater than or equal to 2");
        else 
            System.out.println("You entered WRONG wind speed, it must be greater than or equal to 2");

    }
    
}
