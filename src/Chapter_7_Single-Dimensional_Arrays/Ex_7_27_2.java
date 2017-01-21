package Chapter_7;
public class Ex_7_27_2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1: ");
        String list1 = input.nextLine();
        System.out.print("Enter list2: ");
        String list2 = input.nextLine();
        int[] l1 = Methods.sTI(list1);
        int[] l2 = Methods.sTI(list2);
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
            int c2 = 0;
            if (check > 1) {
                for (int t = 0; t < l1.length; t++)
                    if (l1[i] == l1[t]) c2++;
                if (check != c2) return false;
            }
            int cO = 0;
            for (int m = 0; m < l2.length; m++)
                if (l2[i] == l1[m]) cO++;
            if (cO == 0) return false;
        }
        return true;
    }
    
}
