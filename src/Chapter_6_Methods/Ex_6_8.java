package Chapter_6;
public class Ex_6_8 {
    
    public static void main(String[] args) {
        
        System.out.printf("%-12s%-15s|     %-15s%1s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        for (int i = 0; i < 55; i++)
            System.out.print("-");
        System.out.println();
        for (double celsius = 40, fahrenheit = 120; celsius >= 31 && fahrenheit >= 30; celsius--, fahrenheit -= 10)
            System.out.printf("%-12.2f%-15.2f|     %-15.2f%1.2f\n", celsius, Chapter6Methods.celsiusToFahrengeit(celsius), fahrenheit, Chapter6Methods.fahrenheitToCelsius(fahrenheit));
        
    }
    
}
