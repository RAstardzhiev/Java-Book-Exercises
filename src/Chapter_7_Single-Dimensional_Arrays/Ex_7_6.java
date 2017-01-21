package Chapter_7;
public class Ex_7_6 {
    public static void main(String[] args) {

System.out.println("\nThe first 50 prime numbers are \n");
int[] ar = new int[50];
Methods.fas(ar);
for (int i = 0; i < ar.length; i++) {
    if (i % 10 == 0)
        System.out.println();
    System.out.print(ar[i] + " ");
}

    }
}
