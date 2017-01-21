package Chapter_7;
public class Ex_7_35 {
    public static void main(String[] args) {
        System.out.println("\t*** GAME *** HangMan ***");
        java.util.Scanner input = new java.util.Scanner(System.in);
        while (true) {
            Methods.besenkaExecution();
            boolean q = false;
            while (true) {
                System.out.print("\nDo you want to guess another word? Enter y or n >");
                char cont = input.next().charAt(0);
                if (cont == 'n') {
                    q = true;
                    break;
                }
                else if (cont == 'y')
                    break;
                else 
                    System.out.println("\nWrong answer. Try again");
            }
           if (q) break;
        }
    }
}
