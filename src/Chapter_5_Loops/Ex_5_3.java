package Chapter_5;
public class Ex_5_3 {
public static void main(String[] args) {
    
    String k = "Kilograms", p = "Pounds";
    System.out.printf("%-13s%-13s\n", k, p);
    
    for (int kg = 1; kg <= 199; kg += 2)
        System.out.printf("%-13d%-13.2f\n", kg, kg * 2.2);

}    
}
