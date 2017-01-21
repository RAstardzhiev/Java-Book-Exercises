package Chapter_3;

public class _3_4 {
    public static void main(String[] args) {
        
    //    int number = (int)(Math.random() * 100 / 8); *** Also works but worst variation
        int number = (int)(Math.random() * 100 % 13);
        
        // To acoid Zeros -->
        System.out.println("Random number is " + number);
        if (number == 0)
            number = (int)(Math.random() * 100 % 13);
        // <-- Avoid Zeros
        
        switch (number) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("Jun"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println(number + " Try Again");
        }
    }
    
}
