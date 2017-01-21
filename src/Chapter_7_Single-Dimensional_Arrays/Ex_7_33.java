package Chapter_7;
import java.util.Scanner;
public class Ex_7_33 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a year: ");
int year = input.nextInt();
String a[] = new String[12];
a[0] = "monkey";
a[1] = "rooster";
a[2] = "dog";
a[3] = "pig";
a[4] = "rat";
a[5] = "ox";
a[6] = "tiger";
a[7] = "rabbit";
a[8] = "dragon";
a[9] = "snake";
a[10] = "horse";
a[11] = "sheep";
System.out.println(year + " year is the " + a[year % 12] + "'s year");
}
}
