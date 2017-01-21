package Chapter_4;
import java.util.Scanner;
public class Ex_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What applies to you?\n" + 
                "For major:\n" +
                "\tM for Mathematics\n" + 
                "\tC for Computer Science\n" +
                "\tI for Information Technology\n" +
                
                "\nFor status choose between: \n" +
                "\t1 for Freshman\n" +
                "\t2 for Sophomore\n" +
                "\t3 for Junior\n" +
                "\t4 for Senior\n");
        
        System.out.print("Enter your Major and Status: ");
        String es = input.next();

        es = es.substring(0,2);
        
        // Separating the Two
        String m = es.substring(0,1);
        char status = es.charAt(1);
/*        System.out.println("Major is " + m + 
                "\nStatus is " + s);
*/

//      System.out.println(status + " is " + (int)status);
        String s = "";
        switch (status) {
            case 49: s = "Freshman"; break;
            case 50: s = "Sophomore"; break;
            case 51: s = "Junior"; break;
            case 52: s = "Senior"; break;
            default: s = "WRONG value for Status";
        }
        
        if (m.equalsIgnoreCase("M"))
            System.out.println(es.toUpperCase() + " is Mathematiccs " + s);
        else if (m.equalsIgnoreCase("C"))
            System.out.println(es.toUpperCase() + " is Computer Science " + s);
        else if (m.equalsIgnoreCase("I"))
            System.out.println(es.toUpperCase() + " is Information Technology " + s);
        else 
            System.out.println(m + " is WRONG value for Major.\n \t- for Status you entered " + s);
        

    }
}
