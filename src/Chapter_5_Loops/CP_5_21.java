package Chapter_5;
import java.util.Scanner;
public class CP_5_21 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Prompt the user to enter two integers
System.out.print("Enter first integer: ");
int n1 = input.nextInt();
System.out.print("Enter second integer: ");
int n2 = input.nextInt();

int gcd = 1; // Initial gcd is 1
int k = 2; // Possible gcd
while (k <= n1 && k <= n2) {
if (n1 % k == 0 && n2 % k == 0)
gcd = k; // Update gcd
k++;
}

System.out.println("The greatest common divisor for " + n1 +
" and " + n2 + " is " + gcd);
    }
    
}
