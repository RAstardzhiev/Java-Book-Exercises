package Chapter_5;
public class Ex_5_6 {
public static void main(String[] args) {
    String m = "Miles", k = "Kilometers";
    System.out.printf("%-10s%-10s  |  %-15s%-10s\n", m, k, k, m);
    
    for (int mile = 1, km = 20; mile <= 10 && km <= 65; mile++, km += 5) {
        System.out.printf("%-10d%-10.3f  |  %-15d%-10.3f\n", mile, mile * 1.609, km, km / 1.609);
    }
    
}    
}
