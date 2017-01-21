package Chapter_4;
import java.util.Scanner;
public class Ex_4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first city: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String s2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String s3 = input.nextLine();
        
        String firstCity = "";
        String secondCity = "";
        String thirdCity = "";
        
        if (s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0)
            firstCity = s1;
        else if(s2.compareTo(s1) < 0 && s2.compareTo(s3) < 0)
            firstCity = s2;
        else
            firstCity = s3;
        
        if (s2.compareTo(s1) > 0 && s2.compareTo(s3) < 0 || s2.compareTo(s1) < 0 && s2.compareTo(s3) > 0)
            secondCity = s2;
        else if (s1.compareTo(s2) > 0 && s1.compareTo(s3) < 0 || s1.compareTo(s2) < 0 && s1.compareTo(s3) > 0)
            secondCity = s1;
        else 
            secondCity = s3;
        
        if (s3.compareTo(s1) > 0 && s3.compareTo(s2) > 0)
            thirdCity = s3;
        else if (s2.compareTo(s1) > 0 && s2.compareTo(s3) > 0)
            thirdCity = s2;
        else
            thirdCity = s1;
        
        System.out.println("s3.compareTo(s2) " + s3.compareTo(s2));
        System.out.println("The three cities in alphabetical order are: " + 
                "\n\t" + firstCity + 
                "\n\t" + secondCity + 
                "\n\t" + thirdCity);
        
    }
}
