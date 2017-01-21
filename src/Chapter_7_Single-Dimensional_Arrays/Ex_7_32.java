package Chapter_7;
public class Ex_7_32 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list: ");
        String list = input.nextLine();
        int[] l = Methods.sTI(list);
        int position = Methods.partition(l) + 1;
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < l.length; i++)
            System.out.print(l[i] + " ");
        System.out.println();
        System.out.print("Your Pivot is at the ");
        switch (position) {
            case 1: System.out.print("First"); break;
            case 2: System.out.print("Second"); break;
            case 3: System.out.print("Third"); break;
            default: System.out.print(position + "th");
        }
        System.out.print(" position\n");
    }
}
