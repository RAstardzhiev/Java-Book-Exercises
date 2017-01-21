package Chapter_7;
public class Ex_7_29 {
    public static void main(String[] args) {
        System.out.println("*** GAME ***");
        System.out.println("Pick 4 Cards");
        int count = 0, sum = 0;
        while (true) {
            int pick = (int)(Math.random() * 52);
            count++;
            if (pick == 0 || pick == 13 || pick == 26 || pick == 39) { // Ace
                        if (sum + 1 > 24)
                            continue;
                        else 
                            sum += 1;
            }
            else if (pick == 10 || pick == 23 || pick == 36 || pick == 49) { // Jack
                        if (sum + 11 > 24)
                            continue;
                        else 
                            sum += 11;
            }
            else if (pick == 11 || pick == 24 || pick == 37 || pick == 50) { // Queen
                        if (sum + 12 > 24)
                            continue;
                        else 
                            sum += 12;
            }
            else if (pick == 12 || pick == 25 || pick == 38 || pick == 51) { // King
                        if (sum + 13 > 24)
                            continue;
                        else 
                            sum += 13;
            }
            else if (pick > 0 && pick <= 9) {
                for (int i = 1, val = 2; i <= 9; i++, val++)
                    if (pick == i)  {
                        if (sum + val > 24)
                            continue;
                        else 
                            sum += val;
                    }
            }
            else if (pick >= 14 && pick <= 22) {
                for (int i = 14, val = 2; i <= 22; i++, val++)
                    if (pick == i)  {
                        if (sum + val > 24)
                            continue;
                        else 
                            sum += val;
                    }
            }
            else if (pick >= 27 && pick <= 35) {
                for (int i = 27, val = 2; i <= 35; i++, val++)
                    if (pick == i)  {
                        if (sum + val > 24)
                            continue;
                        else 
                            sum += val;
                    }
            }
            else if (pick >= 40 && pick <= 48) {
                for (int i = 40, val = 2; i <= 48; i++, val++)
                    if (pick == i)  {
                        if (sum + val > 24)
                            continue;
                        else 
                            sum += val;
                    }
            }
            if (sum == 24) break;
        }
        System.out.println("The picks needed to acheive result of 24 are " + count);
    }
}


