package Chapter_7;
public class Ex_7_3 {
    public static void main(String[] args) {
        System.out.print("Enter integers between 0 and 100 (for finish enter zero 0): ");
        String s = "";
        int count = 0;
        java.util.Scanner input = new java.util.Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            if (n == 0)
                break;
            if (n > 100) {
                System.out.println("Your number " + n + " have to be BETWEEN 0 and 100!!!");
                continue;
            }
            s += n + "/";
            count++;
        }
        int numbers[] = new int[count];
        Methods.stringToInteger(s, numbers);
        Methods.printOccurance(numbers);
        
    }
}
