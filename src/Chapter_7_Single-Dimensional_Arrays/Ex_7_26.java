package Chapter_7;
public class Ex_7_26 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1: ");
        String list1 = input.nextLine();
        System.out.print("Enter list2: ");
        String list2 = input.nextLine();
        int[] l1 = Methods.sTI(list1);
        int[] l2 = Methods.sTI(list2);
        if (Methods.equals(l1, l2))
            System.out.println("Two lists are strictly identical");
        else 
            System.out.println("Two lists are not strictly identical");
    }
}
