package Chapter_8;
import java.util.Scanner;
public class Ex_8_12 {
    public static void main(String[] args) {
// Create a Scanner
Scanner input = new Scanner(System.in);

// Prompt the user to enter filing status
int status = -1;
while (true) {
System.out.print("(0-single filer, 1-married jointly or " +
"qualifying widow(er), 2-married separately, 3-head of " +
"household) Enter the filing status: ");
status = input.nextInt();
if (status >= 0 && status < 4)
    break;
else 
    System.out.println("Wrong status. Try again");
}

// Prompt the user to enter taxable income
System.out.print("Enter the taxable income: ");
double income = input.nextDouble();

double [] percentage = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
int [][] ranges = {
    {8350, 33950, 82250, 171550, 372950}, // Single
    {16700, 67900, 137050, 208850, 372950}, // Married Filing Jointly or Qualifying Widow(er)
    {8350, 33950, 68525, 104425, 186475}, // Married Filing Separately
    {11950, 45500, 117450, 190200, 372950}, // Head of Household
};

// Compute tax
double tax = 0;
    
if (income < ranges[status][0])
    tax = income * percentage[0];
else 
    tax = ranges[status][0] * percentage[0];

    for (int i = 1; i < ranges[status].length; i++) 
        if (income > ranges[status][i])
            tax += (ranges[status][i] - ranges[status][i - 1]) * percentage[i];
        else {
            tax += income - ranges[status][i - 1] * percentage[i];
            break;
        }

if (income > ranges[status][ranges[status].length - 1])
    tax += (income - ranges[status][ranges[status].length - 1]) * percentage[percentage.length - 1];

// Display the result
System.out.println("Tax is " + (int)(tax * 100) / 100.0);
}
}
