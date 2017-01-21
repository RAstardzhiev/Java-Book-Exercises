package Chapter_4;
import java.util.*;
public class Ex_4_13 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a letter: ");
    String letter = input.next();
    String ch = letter.substring(0,1);
    
    if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u"))
        System.out.println(ch + " is a Vowel");
    else if (Character.isLetter(letter.charAt(0)))
        System.out.println(ch + " is a consonant");
    else
        System.out.println(ch + " is an invalid input");
        
    }
}
