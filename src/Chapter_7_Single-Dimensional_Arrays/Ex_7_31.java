package Chapter_7;
public class Ex_7_31 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1: ");
        String list1 = input.nextLine();
        int[] l1 = Methods.sTI(list1);
        System.out.print("Enter list2: ");
        String list2 = input.nextLine();
        int[] l2 = Methods.sTI(list2);
        int marge[] = Methods.marge(l1, l2);
        System.out.print("The marged list is ");
        for (int i = 0; i < marge.length; i++)
            System.out.print(marge[i] + " ");
        System.out.println();
    }
}
