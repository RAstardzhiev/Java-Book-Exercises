package Chapter_6;
public class Ex_6_38 {
    public static void main(String[] args) {
//        System.out.println((char)91);
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0)
                System.out.println();
            System.out.print(" " + Chapter6Methods.upperCaseLetter());
        }
        System.out.println("\n\n");
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0)
                System.out.println();
            System.out.print(" " + Chapter6Methods.lowerCaseLetter());
        }
        System.out.println("\n\n");
    }
}
