package Chapter_8;
public class Methods {
    
    public static double doubleInput() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String s = input.next();
        if (s.contains(","))
            s = s.substring(0, s.indexOf(",")) + "." + s.substring(s.indexOf(",") + 1);
        return Double.parseDouble(s);
    }
    
}
