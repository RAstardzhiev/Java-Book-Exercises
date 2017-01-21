package Chapter_7;
public class Ex_7_27 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1: ");
        String list1 = input.nextLine();
        System.out.print("Enter list2: ");
        String list2 = input.nextLine();
        int[] l1 = Methods.sTI(list1);
        int[] l2 = Methods.sTI(list2);
    /*        System.out.println(list1);
            System.out.println(list2);
            System.out.println(java.util.Arrays.toString(l1));
            System.out.println(java.util.Arrays.toString(l2)); */
        if (equaks(l1, l2))
            System.out.println("Two lists are identical");
        else
            System.out.println("Two lists are NOT identical");
    }
    
    public static boolean equaks(int l1[], int[] l2) {
        if (l1.length != l2.length)
            return false;
        for (int i = 0; i < l1.length; i++) {
            int check = 0;
            for (int k = 0; k < l2.length; k++) 
                if (l1[i] == l2[k]) check++;
            if (check == 0) return false;
        }
        int sum1 = 0;
        for (int i = 0; i < l1.length; i++)
            sum1 += l1[i];
        int sum2 = 0;
        for (int i = 0; i < l2.length; i++)
            sum2 += l2[i];
        if (sum1 != sum2) return false;
        return true;
    }
    
}
