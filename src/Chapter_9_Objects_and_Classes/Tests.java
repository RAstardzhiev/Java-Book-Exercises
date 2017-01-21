package Chapter_9;

import java.util.Date;
import java.util.Random;
import java.util.GregorianCalendar;

public class Tests {
    
/*
boolean x;
public static void main(String[] args) {
Tests a = new Tests();
System.out.println(a.x);
}
/* Output: false */

// *****************************************************************************
/*
private double radius = 1;
// Find the area of this circle 
public double getArea() {
return radius * radius * Math.PI;
}
public static void main(String[] args) {
Tests myCircle = new Tests();
System.out.println("Radius is " + myCircle.radius);
}
/* Output: Radius is 1
Works because private variables are accessible from within the class they are declared */

// *****************************************************************************
/*
public static void main(String[] args) {
Count myCount = new Count();
int times = 0;
for (int i = 0; i < 100; i++)
increment(myCount, times);
System.out.println("count is " + myCount.count);
System.out.println("times is " + times);
}
public static void increment(Count c, int times) {
c.count++;
times++;
}
*/
// *****************************************************************************
/*
public static void main(String[] args) {
Circle circle1 = new Circle(1);
Circle circle2 = new Circle(2);
swap1(circle1, circle2);
System.out.println("After swap1: circle1 = " +
circle1.radius + " circle2 = " + circle2.radius);
swap2(circle1, circle2);
System.out.println("After swap2: circle1 = " +
circle1.radius + " circle2 = " + circle2.radius);
}
public static void swap1(Circle x, Circle y) {
Circle temp = x;
x = y;
y = temp;
}
public static void swap2(Circle x, Circle y) {
double temp = x.radius;
x.radius = y.radius;
y.radius = temp;
}
}
class Circle {
double radius;
Circle(double newRadius) {
radius = newRadius;
}
// swap1 DOESN'T work because it does'nt change values but ONLY the refference (names / variables) inside the method
// which uctually do not affect the refference variables outside the method (swap1)
*/
    
// *****************************************************************************
    
/*
// CP 9.25 a/
public static void main(String[] args) {
int[] a = {1, 2};
swap(a[0], a[1]);
System.out.println("a[0] = " + a[0]
+ " a[1] = " + a[1]);
}
public static void swap(int n1, int n2) {
int temp = n1;
n1 = n2;
n2 = temp;
}
// swap(int n1, int n2) DOESN'T work because it doesn't work with the array but with its values
// Would work if receive the array: public static void swap(int[] array) {
*/
    
// *****************************************************************************

/*
// CP 9.25 b/
    // Output: a[0] = 2 a[1] = 1
public static void main(String[] args) {
int[] a = {1, 2};
swap(a);
System.out.println("a[0] = " + a[0]
+ " a[1] = " + a[1]);
}
public static void swap(int[] a) {
int temp = a[0];
a[0] = a[1];
a[1] = temp;
}
*/
    
// *****************************************************************************
    
/*
// CP 9.25 b/
    // Output: e1 = 2 e2 = 1
public static void main(String[] args) {
T t = new T();
swap(t);
System.out.println("e1 = " + t.e1
+ " e2 = " + t.e2);
}
public static void swap(T t) {
int temp = t.e1;
t.e1 = t.e2;
t.e2 = temp;
}
}
class T {
int e1 = 1;
int e2 = 2;
}
*/

// *****************************************************************************
    
/*
// CP 9.25 b/
    // Output: t1's i = 2 and j = 1
    // Output: t2's i = 2 and j = 1
public static void main(String[] args) {
T t1 = new T();
T t2 = new T();
System.out.println("t1's i = " +
t1.i + " and j = " + t1.j);
System.out.println("t2's i = " +
t2.i + " and j = " + t2.j);
}
}
class T {
static int i = 0;
int j = 0;
T() {
i++;
j = 1;
}
*/
    
// *****************************************************************************
   
/*
// CP. 9.26 a/
public static void main(String[] args) {
Date date = null;
m1(date);
System.out.println(date);
}
public static void m1(Date date) {
date = new Date();
}
*/
    
// *****************************************************************************
    
// CP. 9.26 b/
    /*
public static void main(String[] args) {
Date date = new Date(1234567);
m1(date);
System.out.println(date.getTime());
}
public static void m1(Date date) {
date = new Date(7654321);
}
*/
    
// *****************************************************************************
    
// CP. 9.26 c/
/*
public static void main(String[] args) {
Date date = new Date(1234567);
m1(date);
System.out.println(date.getTime());
}
public static void m1(Date date) {
date.setTime(7654321);
}
   */
    
// *****************************************************************************
    
// CP. 9.26 d/
    /*
public static void main(String[] args) {
Date date = new Date(1234567);
m1(date);
System.out.println(date.getTime());
}
public static void m1(Date date) {
date = null;
}
    */
    
// *****************************************************************************
    /*
public static void main(String[] args) {
java.util.Date[] dates = new java.util.Date[10];
System.out.println(dates[0]);
System.out.println(dates[0].toString());
}
  */
    
// *****************************************************************************
  
/*
// CP. 9.31
    // Output: 
    // i + j is 23 |--> Because adds 2 and 3 as a strings
    // k is 2 |--> Because of the Localizing
    // j is 0 |--> Because of the Localizing
private static int i = 0;
private static int j = 0;
public static void main(String[] args) {
int i = 2;
int k = 3;
// *****************************************************************************
{ // Localizing -->
int j = 3; // Can not be reached outside of {} - therefore this j is local variable
System.out.println("i + j is " + i + j);
} // <-- Localizing
// *****************************************************************************
k = i + j;
System.out.println("k is " + k);
System.out.println("j is " + j);
}
*/

    
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
  
    
/*
// Ex. 9.1
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        
        // Display the width, height, area, and perimeter of each rectangle in this order.
        System.out.printf("Rectangle 1:\n\t- Width: %1.2f\n\t- Height: %1.2f\n\t- Area: %1.2f\n\t- Perimeter: %1.2f\n", r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());
        System.out.printf("\nRectangle 2:\n\t- Width: %1.2f\n\t- Height: %1.2f\n\t- Area: %1.2f\n\t- Perimeter: %1.2f\n", r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
        
        
    }
*/
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
/*
// Ex. 9.2
    public static void main(String[] args) {
        
        Stock company = new Stock("ORCL", "Oracle Corporation");
        company.previousClosingPrice = 34.5;
        company.currentPrice = 34.35;
        
        System.out.print("The price from yesterday changed with ");
        company.upOrDown(34.5, 34.35);
        System.out.println("");
    }
*/
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
/*
// Ex. 9.2
    
    public static void main(String[] args) {
        
        Date now = new Date();
        System.out.println("Now: " + now.toString());
        
        now.setTime(10000);
        System.out.println("+10000: " + now.toString());
        now.setTime(100000);
        System.out.println("+100000: " + now.toString());
        now.setTime(1000000);
        System.out.println("+1000000: " + now.toString());
        now.setTime(10000000);
        System.out.println("+10000000: " + now.toString());
        now.setTime(100000000);
        System.out.println("+100000000: " + now.toString());
        now.setTime(1000000000);
        System.out.println("+1000000000: " + now.toString());
        now.setTime(10000000000L);
        System.out.println("+10000000000: " + now.toString());
        now.setTime(100000000000L);
        System.out.println("+100000000000: " + now.toString());
        
    }
*/
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
/*
// Ex.9.4
    public static void main(String[] args) {
        
        Random r = new Random(1000);
        for (int i = 1; i <= 50; i++) {
            System.out.print(r.nextInt(100) + " ");
            if (i % 10 == 0) System.out.println();
        }
    }
*/
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
    /*
// Ex. 9.5
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        System.out.println(now.getTime());
        System.out.printf("%d.%d.%d\n\n", now.get(now.YEAR), now.get(now.MONTH) + 1, now.get(now.DATE));
        
        now.setTimeInMillis(1234567898765L);
        System.out.printf("%d.%d.%d\n\n", now.get(now.YEAR), now.get(now.MONTH) + 1, now.get(now.DATE));
    }
*/
    
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
   /* 
// Ex. 9.6
    public static void main(String[] args) {
        
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 1000);
        }
        
        StopWatch timer = new StopWatch();
        
        boolean isReady;
        while (true) {
            isReady = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isReady = false;
                }
            }
            if (isReady) break;
        }
        
        timer.stop();
        
        System.out.printf("All %d numbers are sorted for (%d Milliseconds = %f Seconds)\n", numbers.length, timer.getElapsedTime(), timer.getElapsedTime() * 1.0 / 1000);
    }
*/
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
 /*   
// Ex. 9.7 
    public static void main(String[] args) {
        Account myThing = new Account(1122, 20000);
        Account.setAnnualInterestingRate(4.5);
        myThing.withdraw(2500);
        myThing.deposit(3000);
        
        System.out.printf("The Balance of your Bank Account is: %1.2f\n", myThing.getBalance());
        System.out.printf("Your monthly interest is: %1.2f\n", myThing.getMonthlyInterest());
        System.out.printf("Tour Account was created on: %s\n", myThing.getDateCreated());
        
        System.out.println("\nSecond Account:");
        Account secondAccount = new Account(2233, 1500);
        System.out.printf("The Balance of your Bank Account is: %1.2f\n", secondAccount.getBalance());
        System.out.printf("Your monthly interest is: %1.2f\n", secondAccount.getMonthlyInterest());
        System.out.printf("Tour Account was created on: %s\n", secondAccount.getDateCreated());
    }
*/
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
    /*
// Ex 9.8
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setON(true);
        
        fan2.setSpeed(fan2.MEDIUM);
        
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
    */
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
    /*
// Ex. 9.9
     public static void main(String[] args) {
         
        RegularPolygon object1 = new RegularPolygon();
        RegularPolygon object2 = new RegularPolygon(6, 4);
        RegularPolygon object3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.printf("Object 1's Perimeter: %1.2f\n", object1.getPerimeter());
        System.out.printf("Object 1's Area: %1.2f\n\n", object1.getArea());
        System.out.printf("Object 2's Perimeter: %1.2f\n", object2.getPerimeter());
        System.out.printf("Object 2's Area: %1.2f\n\n", object2.getArea());
        System.out.printf("Object 3's Perimeter: %1.2f\n", object3.getPerimeter());
        System.out.printf("Object 3's Area: %1.2f\n\n", object3.getArea());
    }
    */
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
    /*
// Ex. 9.10
    public static void main(String[] args) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        
        System.out.print("Enter the values for \"a\", \"b\", and \"c\": ");
        double a = Double.parseDouble(console.next());
        double b = Double.parseDouble(console.next());
        double c = Double.parseDouble(console.next());
        
        QuadraticEquation object = new QuadraticEquation(a, b, c);
        
        if (object.getDiscriminant() > 0) 
            System.out.printf("\nRoot 1: %1.2f\nRoot 2: %1.2f\n", object.getRoot1(), object.getRoot2());
        else if (object.getDiscriminant() == 0)
            System.out.println("Root 1: " + object.getRoot1());
        else 
            System.out.println("The equation has not roots");
    }
    */
    
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
    /*
// Ex. 9.11
    public static void main(String[] args) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        
        System.out.println("Enter values for \"a\", \"b\", \"c\", \"d\", \"e\" and \"f\": ");
        double a = Double.parseDouble(console.next());
        double b = Double.parseDouble(console.next());
        double c = Double.parseDouble(console.next());
        double d = Double.parseDouble(console.next());
        double e = Double.parseDouble(console.next());
        double f = Double.parseDouble(console.next());
        
        LinearEquation ob = new LinearEquation(a, b, c, d, e, f);
        if (ob.isSolvable()) 
            System.out.printf("x = %1.2f\ny = %1.2f\n", ob.getX(), ob.getY());
        else System.out.println("The equation has no solution");
    }
    */
    
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
    /*
// Ex. 9.12
    public static void main(String[] args) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        
        System.out.println("Enter \"x1\", \"y1\", \"x2\", \"y2\", \"x3\", \"y3\", \"x4\", \"y4\", ");
        double x1 = Double.parseDouble(console.next());
        double y1 = Double.parseDouble(console.next());
        double x2 = Double.parseDouble(console.next());
        double y2 = Double.parseDouble(console.next());
        double x3 = Double.parseDouble(console.next());
        double y3 = Double.parseDouble(console.next());
        double x4 = Double.parseDouble(console.next());
        double y4 = Double.parseDouble(console.next());
        
        LinearEquation iP = new LinearEquation(y1 - y2, x1 - x2, y3 - y4, x3 - x4, (y1 - y2) * x1 - (x1 - x2) * y1, (y3 - y4) * x3 - (x3 - x4) * y3);
        if (iP.isSolvable())
            System.out.printf("x = %1.2f\ny = %1.2f\n", iP.getX(), iP.getY());
        else System.out.println("The two lines are aprallel");
    }
*/
    
// **   EXERCISES   **************   EXERCISES   ***********   EXERCISES   *****
    
    
// Ex. 9.13
    public static void main(String[] args) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        System.out.print("Enter the number of Rows and Columns in the array: ");
        int r = Integer.parseInt(console.next());
        int c = Integer.parseInt(console.next());
        double d[][] = new double[r][c];
        System.out.println("Enter the array: ");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = Double.parseDouble(console.next());
            }
        }
        Location result = Location.locateLargest(d);
        System.out.printf("The location of the largest element is %1.2f at (%d, %d)\n", result.maxValue, result.row, result.column);
    }
    
}


    

