package Chapter_7;
public class Ex_7_21 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("\t   **** GAME ****");
        System.out.println("\t*** Bean Machine ***");
        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();
        int slots = 0;
        while (true) {
        System.out.print("Enter the numbe rof slots in the bean machine: ");
        slots = input.nextInt();
        if (slots > 1)
            break;
        else 
            System.out.println("The slots MUST be more than 1");
        }
        int[] fallen = new int[slots];
        System.out.println();
        Methods.slotFilling(balls, fallen);
        System.out.println();
        for (int i = 0; i < fallen.length; i++) {
            System.out.print("Slot " + (i + 1) + ": ");
            for (int p = fallen[i]; p > 0; p--)
                System.out.print("O");
            System.out.println();
        }
    }
}
