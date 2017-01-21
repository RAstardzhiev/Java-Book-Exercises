package Chapter_4;
import java.util.Scanner;
public class Ex_4_7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the radius of the boundong circle: ");
    double r = input.nextDouble();
    
    // 360 / 5 = 72 => Each angle in the center is 72 Degrees
        // Because Java calculates "sin, cos, tan" in Radians  
    double angle = Math.toRadians(72);
    
// Finding the Side Size of the Pentagon --> Unneeded
//    double pentagonSide = Math.sqrt(Math.pow(r, 2) + Math.pow(r, 2) - 2 * r * r * Math.cos(angle));
//    Another Formula for Side - Book Ex_4_1
//    double pentagonSide = 2 * r * Math.sin(Math.PI / 5);
//    System.out.println(Math.cos(Math.toRadians(49))); have to be 0.656...

// P1
    double x1 = 0.000132679;
    double y1 = r;
// P2
    double x2 = Math.cos(angle) * r;
    double y2 = Math.sin(angle) * r;
// P3
    angle = Math.toRadians(144);
    double x3 = Math.cos(angle) * r;
    double y3 = Math.sin(angle) * r;
// P4
    angle = Math.toRadians(216);
    double x4 = Math.cos(angle) * r;
    double y4 = Math.sin(angle) * r;
    System.out.println("P4 Math.sin(angle) is: " + Math.sin(angle) * r);
// P5
    angle = Math.toRadians(288);
    double x5 = Math.cos(angle) * r;
    double y5 = Math.sin(angle) * r;
// P6
    angle = Math.toRadians(359);
    double x6 = Math.cos(angle) * r;
    double y6 = Math.sin(angle) * r;
    
    System.out.printf("%-18s%-10s%-10s\n", "Point Number", "x", "y");
    System.out.printf("%-18s%-10.4f%-10.4f\n", "Point One", x1, y1);
    System.out.printf("%-18s%-10.4f%-10.4f\n", "Point Two", x2, y2);
    System.out.printf("%-18s%-10.4f%-10.4f\n", "Point Three", x3, y3);
    System.out.printf("%-18s%-10.4f%-10.4f\n", "Point Four", x4, y4);
    System.out.printf("%-18s%-10.4f%-10.4f\n", "Point Five", x5, y5);
    System.out.printf("%-18s%-10.4f%-10.4f\n", "Point One", x6, y6);
    
    }
}
