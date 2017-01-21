package Chapter_5;
public class CP_5_24_a {
public static void main(String[] args) {
int balance = 10;
int count = 0;
while (true) {
if (balance < 9)
break;
balance = balance - 9;
count++;
}
System.out.println("Balance must be 1 and is: " + balance + "\nCount must be 1 and is: " + count);
}    
}
