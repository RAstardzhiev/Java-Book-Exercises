package Chapter_5;
public class Ex_5_4 {
public static void main(String[] args) {
    
    String m = "Miles", k = "Kilometers";
    System.out.printf("%-7s%-7s\n", m, k);
    
    for (int mile = 1; mile <= 10; mile++)
        System.out.printf("%-7d%-7.2f\n", mile, mile * 1.609);

}    
}
