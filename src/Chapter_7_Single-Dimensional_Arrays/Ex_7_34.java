package Chapter_7;
public class Ex_7_34 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String ent = input.nextLine();
        System.out.println("Your input sorted is: " + Methods.sort(ent));
    }
}
