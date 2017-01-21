package Chapter_4;
public class Ex_4_6 {
    public static void main(String[] args) {
        
        double x1 = (int)(Math.random() * 10000) / 100.0 % 81 - 40;
        double x2 = (int)(Math.random() * 10000) / 100.0 % 81 - 40;
        double x3 = (int)(Math.random() * 10000) / 100.0 % 81 - 40;
        double y1 = (int)(Math.random() * 10000) / 100.0 % 81 - 40;
        double y2 = (int)(Math.random() * 10000) / 100.0 % 81 - 40;
        double y3 = (int)(Math.random() * 10000) / 100.0 % 81 - 40;      
/* Check Point 
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
*/
        
        // Pitagorian Theoreme - for the lenght of each side
        double s1 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double s2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double s3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
/*
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

/*        // Angles - Also Works but longer code
        double cosA1 = (Math.pow(s2, 2) + Math.pow(s1, 2) - Math.pow(s3, 2)) / (2 * s2 * s1);
/* cosA1 = 0.25; --> have to be 75.5... Degrees
        Double angleA1 = Math.acos(cosA1);
        System.out.println(cosA1);
        System.out.println(Math.toDegrees(angleA1));
<-- Perfect :) */

        // Angles - Shorter way
        double angle1InRadians = Math.acos((Math.pow(s2, 2) + Math.pow(s1, 2) - Math.pow(s3, 2)) / (2 * s2 * s1));
        double angle2InRadians = Math.acos((Math.pow(s2, 2) + Math.pow(s3, 2) - Math.pow(s1, 2)) / (2 * s2 * s3));
        double angle3InRadians = Math.acos((Math.pow(s1, 2) + Math.pow(s3, 2) - Math.pow(s2, 2)) / (2 * s1 * s3));
        
        System.out.println("The program generated a random triangle with the following angles: ");
        
        System.out.printf("\t- Angle \"A\" is: %-4.2f", Math.toDegrees(angle1InRadians));
        System.out.printf(" Degrees\t Or converted to radians it is: %-4.2f", angle1InRadians);
        System.out.println(" Radians");
        
        System.out.printf("\t- Angle \"B\" is: %-4.2f", Math.toDegrees(angle2InRadians));
        System.out.printf(" Degrees\t Or converted to radians it is: %-4.2f", angle2InRadians);
        System.out.println(" Radians");
        
        System.out.printf("\t- Angle \"C\" is: %-4.2f", Math.toDegrees(angle3InRadians));
        System.out.printf(" Degrees\t Or converted to radians it is: %-4.2f", angle3InRadians);
        System.out.println(" Radians");
        
        System.out.println("\nChecking the acuracy --> A + B + C must equals to 180 Degrees");
        
        System.out.printf("\tA + B + C = %1.2f", Math.toDegrees(angle1InRadians));
        System.out.printf(" + %1.2f", Math.toDegrees(angle2InRadians));
        System.out.printf(" + %1.2f", Math.toDegrees(angle3InRadians));
        System.out.printf(" = %1.2f\n", (Math.toDegrees(angle1InRadians) + Math.toDegrees(angle2InRadians) + Math.toDegrees(angle3InRadians)));
        
        System.out.println("\nWithout Formating the numbers: A + B + C = " + Math.toDegrees(angle1InRadians) + " + " + Math.toDegrees(angle2InRadians) + " + " + Math.toDegrees(angle3InRadians) + " = " + (Math.toDegrees(angle1InRadians) + Math.toDegrees(angle2InRadians) + Math.toDegrees(angle3InRadians)));
    }
}
