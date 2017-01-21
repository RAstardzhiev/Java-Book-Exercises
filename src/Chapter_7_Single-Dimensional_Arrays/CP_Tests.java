package Chapter_7;
public class CP_Tests {
    public static void main(String[] args) {
        
        /* CP 7.3 --> Should Display -->
        // x is 60
        // The size of numbers is 30
int x = 30;
int[] numbers = new int[x];
x = 60;
System.out.println("x is " + x);
System.out.println("The size of numbers is " + numbers.length);
        // Successfull
        */
        
// -------------------------------------------------------------------------
        
        /* CP 7.8
            // a.
                double d[] = new double[10];
                System.out.println("a: " + d.length);
            // b.
                d[0] = 5.5;
                System.out.println("b: " + d[0]);
            // c.
                d[1] = 3.3;
                System.out.println("c: " + (d[0] + d[1]));
            // d. --> Should Display --> d: 52.8
                for (int i = 2; i < d.length; i++)
                    d[i] = i;
                double sum = 0;
                for (int i = 0; i < d.length; i++)
                    sum += d[i];
                System.out.println("d: " + sum);
                // Successful
            // e.
                double min = d[0];
                for (double e: d) 
                    if (e < min) min = e;
                System.out.println("e: " + min);
            // f.
                System.out.println("f: " + d[(int)(Math.random() * 100) % d.length]);
            // g.
                double f[] = {3.5, 5.5, 4.52, 5.6};
                System.out.println("g: -->");
                for (int i = 0; i < f.length; i++)
                    System.out.println("\t- index " + i + ": " + f[i]);
            */

// -------------------------------------------------------------------------
        
/* CP 7.11
int list[] = {1, 2, 3, 4, 5, 6};
for (int i = 1; i < list.length; i++)
list[i] = list[i - 1];
for (int i = 0; i < list.length; i++)
System.out.print(list[i] + " ");
*/

// -------------------------------------------------------------------------

        /* CP 7.13
        int[] source = {3, 4, 5};
        int[] t = new int [source.length];
        System.arraycopy(source, 0, t, 0, source.length);
        for (int i = 0; i < t.length; i++)
            System.out.println("t is " + t[i]);
        */

// -------------------------------------------------------------------------
        
/* CP 7.14
int[] myList;
myList = new int[10];
for (int i = 0; i < myList.length; i++)
    myList[i] = i + 1;
System.out.println("Length is: " + myList.length);
for (int i = 0; i < myList.length; i++)
    System.out.print(" " + myList[i]);
System.out.println();
        
myList = new int[20];
System.out.println("Length is: " + myList.length);
for (int i = 0; i < myList.length; i++)
    System.out.print(" " + myList[i]);
System.out.println();
*/

// -------------------------------------------------------------------------

/*
int i = 0;
System.out.println('z' - 'a');
System.out.println('a' - 'a');
*/

// -------------------------------------------------------------------------

/* CP 7.17 a. - Output Should be --> |number is 0 and numbers[0] is 3|
int number = 0;
int[] numbers = new int[1];
m(number, numbers);
System.out.println("number is " + number
+ " and numbers[0] is " + numbers[0]);
}
public static void m(int x, int[] y) {
x = 3;
y[0] = 3;
// Successful
*/
        
// -------------------------------------------------------------------------

/* CP 7.17 b. 
int[] list = {1, 2, 3, 4, 5};
reverse(list);
for (int i = 0; i < list.length; i++)
System.out.print(list[i] + " ");
*/

// -------------------------------------------------------------------------

/* CP 7.28 Output Should be --> 
// [7, 7, 7, 7]
// [2, 4, 7, 10]
// false
int[] list1 = {2, 4, 7, 10};
java.util.Arrays.fill(list1, 7);
System.out.println(java.util.Arrays.toString(list1));
int[] list2 = {2, 4, 7, 10};
System.out.println(java.util.Arrays.toString(list2));
System.out.print(java.util.Arrays.equals(list1, list2));
*/


java.util.Scanner input = new java.util.Scanner(System.in);

/* Do NOT work --> Direct Input into array --> Do NOT work
System.out.print("Enter a your numbers in the list: (for finish just enter zero 0)");
int[] ns = new int;
for (int i = 0; true; i++) {
    int ent = input.nextInt();
    if (ent == 0) break;
    ns[i] = ent;
}
System.out.println(ns.length);
System.out.println(ns[0]);
*/

System.out.println((int)(Math.random() * 8) + 1);

// Main Method
    }
    
// Methods
public static void reverse(int[] list) {
int[] newList = new int[list.length];
for (int i = 0; i < list.length; i++)
newList[i] = list[list.length - 1 - i];
list = newList;
}
// Class
}
