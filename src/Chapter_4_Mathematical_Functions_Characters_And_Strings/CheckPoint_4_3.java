
package Chapter_4;

public class CheckPoint_4_3 {
    public static void main(String[] args) {
        // Book way
        double radians = Math.PI / (180.0 / 47);
        // Other way
        double oradians = 47 * Math.PI / 180;
        
        System.out.println("Book way --> 47 degrees = " + radians);
        System.out.println("Other way -> 47 degrees = " + oradians);
    }
    
}
