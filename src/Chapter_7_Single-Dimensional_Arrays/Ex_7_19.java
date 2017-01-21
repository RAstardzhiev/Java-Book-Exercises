package Chapter_7;
public class Ex_7_19 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("How many numbers contains your list? ");
        int size = input.nextInt();
        if (size <= 1) System.out.println("Your list have no more than 1 number");
        else {
        int[] a = new int[size];
        System.out.print("Enter the " + size + " numbers of your list: ");
        for (int i = 0; i < a.length; i++)
            a[i] = input.nextInt();
        if (Methods.isSorted(a))
            System.out.println("The list is already sorted");
        else 
            System.out.println("The list is not sorted");
        }
    }
}
