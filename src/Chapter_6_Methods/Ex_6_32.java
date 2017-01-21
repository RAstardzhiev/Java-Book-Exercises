package Chapter_6;
public class Ex_6_32 {
    public static void main(String[] args) {
        System.out.println("Game: *** Crops *** Roll the Dies ***");
        int wins = 0;
        for (int i = 0; i < 10000; i++) {
            int p = 0;
            while (true) {
                int die1 = (int)(Math.random() * 10 % 6 + 1);
                int die2 = (int)(Math.random() * 10 % 6 + 1);

                if (die1 + die2 == 7 && p != 0) {
                    break;
                }
                if (die1 + die2 == p) {
                wins++;
                break;
                }
                if (die1 + die2 == 4 || die1 + die2 == 5 || die1 + die2 == 6 || die1 + die2 == 8 || die1 + die2 == 9 || die1 + die2 == 10) {
                    if (p == 0)
                        p = die1 + die2;
                }

                if (p != 0)
                    continue;
                if (die1 + die2 == 7 && p == 0 || die1 + die2 == 11) {
                    wins++;
                    break;
                }
                if (die1 + die2 == 2 || die1 + die2 == 3 || die1 + die2 == 12) {
                    break;
                }
            }
        }
        System.out.println("The number of wins for 10 000 games is " + wins);
    }
}
