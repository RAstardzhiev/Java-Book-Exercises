package Chapter_5;
public class Ex_5_5 {
public static void main(String[] args) {
    
    String k = "Kilograms", p = "Pounds";
    System.out.printf("%-12s%-10s | %10s%12s\n", k, p, p, k);
    System.out.print("_______________________________________________\n");
    
        for (int kg = 1, pound = 20; kg <= 199 && pound <= 515; kg += 2, pound += 5) {
            if (pound < 100)
                System.out.printf("%-12d%6.2f     |     %1d%15.2f\n", kg, kg * 2.2, pound, pound / 2.2);
            else 
                System.out.printf("%-12d%6.2f     |     %1d%14.2f\n", kg, kg * 2.2, pound, pound / 2.2);
            
            String row = "-";
            for (int br = 1; br <= 47; br++)
                System.out.print(row);
            
            System.out.println();
        }
}    
}
