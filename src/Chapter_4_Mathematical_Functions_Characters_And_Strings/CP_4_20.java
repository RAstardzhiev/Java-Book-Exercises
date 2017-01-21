/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_4;

/**
 *
 * @author Free_CCQEB
 */
public class CP_4_20 {
    public static void main(String[] args) {
        
        String s1 = " Welcome ";
        String s2 = " welcome ";
        
        System.out.println("(a): Is \"s1\" aqual to \"s2\" " + s1.equals(s2));
        System.out.println("(b): Is \"s1\" aqual to \"s2\" as the leter Case is Ignored " + s1.equalsIgnoreCase(s2));
        
        int x = s1.compareTo(s2);
        System.out.println("\n(c): The comparison shows " + x);
        x = s1.compareToIgnoreCase(s2);
        System.out.println("(d): The comparison with Ignored Cese shows " + x);
        

        Boolean b = s1.startsWith("AAA");
        System.out.println("\n(e): Does \"s1\" has a prefix \"AAA\" - " + b);
        b = s1.endsWith("AAA");
        System.out.println("(f): Does \"s1\" has a suffix \"AAA\" - " + b);
        
        x = s1.length();
        System.out.println("\n(g): The length of \"s1\" (" + s1 + ") is - " + x);
        char y = s1.charAt(1);
        System.out.println("(h): The first letter of " + s1 + "is - " + y);
        
        String s3 = s1 + s2;
        System.out.println("(i): s1 + s2 = " + s3);
        System.out.println("(j): s1.substring(4) = " + s1.substring(4));
        System.out.println("(k): s1.substring(1, 4) = " + s1.substring(1, 4));
        System.out.println("(l): s1.toLowerCase() = " + s1.toLowerCase());
        System.out.println("(m): s1.toUpperCase() = " + s1.toUpperCase());
        System.out.println("(n): Trimmed (" + s1 + ") is: (" + s1.trim() + ")");
        System.out.println("(o): s1.indexOf(\"e\") = " + s1.indexOf("e"));
        System.out.println("\t- MyTry s1.indexOf(\"e\", 3) = " + s1.indexOf("e", 3));
        System.out.println("\t- MyTry: s1.lastIndexOf(\"e\") = " + s1.lastIndexOf("e"));
        int x1 = s1.lastIndexOf("abc");
        System.out.println("(p): s1.lastIndexOf(\"abc\") = " + x1);
        System.out.println("\t- MyTry s1.lastIndexOf(\"e\", 3) = " + s1.lastIndexOf("e", 3));
        
    }
    
}
