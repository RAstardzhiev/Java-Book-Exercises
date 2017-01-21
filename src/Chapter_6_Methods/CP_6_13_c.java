/*
Output -->
Before the call variable times is 3
n = 3
Welcome to Java!
n = 2
Welcome to Java!
n = 1
Welcome to Java!
After the call variable times is 3
*/
package Chapter_6;
public class CP_6_13_c {
    
public static void main(String[] args) {
// Initialize times
int times = 3;
System.out.println("Before the call,"
+ " variable times is " + times);
// Invoke nPrintln and display times
nPrintln("Welcome to Java!", times);
System.out.println("After the call,"
+ " variable times is " + times);
}
// Print the message n times
public static void nPrintln(
String message, int n) {
while (n > 0) {
System.out.println("n = " + n);
System.out.println(message);
n--;
}
}
    
}
