package Chapter_7;
public class Methods {
    
    public static void intArrayInverse(int... array) {
        int temp;
        for (int i = 0, k = array.length - 1; i < k; i++, k--) {
            temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    }
    
    public static void printIntArray(int... array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
    
    public static void stringToInteger(String s, int... array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(s.substring(0, s.indexOf("/")));
            s = s.substring(s.indexOf("/") + 1);
        }
    }
    
    public static int integerOcuranceInArray(int n, int[] ar) {
        int times = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == n)
                times++;
        }
        return times;
    }
    public static void printOccurance(int[] ar) {
        java.util.Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            if (i > 0)
                if (ar[i] == ar[i - 1])
                    continue;
            if (integerOcuranceInArray(ar[i], ar) < 2)
                System.out.println(ar[i] + " occurs " + integerOcuranceInArray(ar[i], ar) + " time");
            else
                System.out.println(ar[i] + " occurs " + integerOcuranceInArray(ar[i], ar) + " times");
        }
    }
    
    // Ex 7.4
    public static double[] createArray() {
        System.out.println("When you are done enter a negative number");
        String s = "";
        int count = 0;
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 1; true; i++) {
            System.out.print("Enter score " + i + ": ");
            double temp = input.nextDouble();
            if (temp < 0)
                break;
            s += temp + "/";
            count++;
        }
        double[] d = new double[count];
        stringToDoubleArray(s, d);
        return d;
    }
    public static void stringToDoubleArray(String s, double[] d) {
        for (int i = 0; i < d.length; i++) {
            d[i] = Double.parseDouble(s.substring(0, s.indexOf("/")));
            s = s.substring(s.indexOf("/") + 1);
        }
    }
    public static double sumArray(double[] d) {
        double sum = 0;
        for (int i = 0; i < d.length; i++)
            sum += d[i];
        return sum;
    }
    public static void printTheRest(double[] d) {
        double avarage = sumArray(d) / d.length;
        int above = 0, eqtoav = 0, below = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] > avarage)
                above++;
            else if (d[i] < avarage)
                below++;
            else 
                eqtoav++;
        }
        System.out.println("\nThe avarage is " + avarage);
        System.out.println(above + " scores are above " + avarage);
        System.out.println(eqtoav + " scores are equal " + avarage);
        System.out.println(below + " scores are below " + avarage);
    }
    
    // Ex 7.6
    public static boolean pna(int n) {
        boolean t = true;
        
        for (int i = (int)Math.sqrt(n); i >= 2; i--) {
            if (n % i == 0) {
                t = false;
                break;
            }
        }
        return t;
    }
    public static void fas(int[] a) {
        for (int i = 0, n = 2; i < a.length; n++) {
            if (pna(n)) {
                a[i] = n;
                i++;
            }
        }
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.7
    public static void randomIntegers(int[] a) {
        for (int i = 0; i < a.length; i++)
            a[i] = (int)(Math.random() * 10);
    }
    public static void countIntegers(int[] a, int[] count) {
        for (int i = 0; i < a.length; i++)
            count[a[i]]++;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.8
    public static int average(int[] a) {
        int average = 0;
        for (int i = 0; i < a.length; i++)
            average += a[i];
        return average / a.length;
    }
    public static double average(double[] a) {
        double average = 0;
        for (int i = 0; i < a.length; i++)
            average += a[i];
        return average / a.length;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.9
    public static double min(double[] a) {
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.10
    public static int indexOfSmallestElement(double a[]) {
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] <a[min])
                min = i;
        }
        return min;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.11
    public static double deviation(double[] a) {
        double dev = 0;
        for (int i = 0; i < a.length; i++)
            dev += Math.pow((a[i] - mean(a)), 2);
        return Math.sqrt(dev / (a.length - 1));
    }
    public static double mean(double[] a) {
        double mean = 0;
        for (int i = 0; i < a.length; i++)
            mean += a[i];
        return mean / a.length;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.12
    public static void reverseDoubleArray(double a[]) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            double temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.13
    public static int getRandom(int... numbers) {
        int n;
        while (true) {
            int count = 0;
            n = 1 + (int)(Math.random() * 100)  % 54;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == n)
                    count++;
            }
            if (count != 0)
                continue;
            else 
                return n;
        }
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.14
    public static int gcd(int... n) {
        int gcd = n[0];
        for (int i = 1; i < n.length; i++)
            if (n[i] < gcd) gcd = n[i];
        while (true) {
            int count = 0;
            for (int i = 0; i < n.length; i++) {
                if (n[i] % gcd == 0)
                    continue;
                else {
                    gcd--;
                    count++;
                    break;
                }
            }
            if (count == 0) return gcd;
        }
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.15
    public static int[] eliminateDuplicates(int[] list) {
        String s = "", temp;
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            temp = list[i] + "/";
            if (s.contains(temp))
                continue;
            s += temp;
            count++;
        }
        int[] a = new int[count];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s.substring(0, s.indexOf("/")));
            s = s.substring(s.indexOf("/") + 1);
        }
        return a;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.16
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
            }
            return -1;
    }
public static int binarySearch(int[] list, int key) {
int low = 0;
int high = list.length - 1;
while (high >= low) {
int mid = (low + high) / 2;
if (key < list[mid])
high = mid - 1;
else if (key == list[mid])
return mid;
else
low = mid + 1;
}
return (low * -1) - 1; // Now high < low, key not found
}

// -----------------------------------------------------------------------------
    // Ex 7.17
    public static String nextLineString() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        return input.nextLine();
    }
    public static int indexOfMax(double[] a, int index) {
        for (int i = index; i < a.length; i++)
            if (a[i] > a[index]) index = i;
        return index;
    }
    public static void swapNamesAndScore(double[] scores, String[] names) {
        for (int i = 0; i < scores.length; i++) {
            int max = indexOfMax(scores, i);
            double temp = scores[i];
            scores[i] = scores[max];
            scores[max] = temp;
            String t = names[i];
            names[i] = names[max];
            names[max] = t;
        }
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.18
    public static void bubbleSort(double a[]) {
        while (true) {
            int count = 0;
            for (int i = 0; i< a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    double temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                }
            }
            if (count == 0) break;
        }
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.19
    public static boolean isSorted(int list[]) {
        int index = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != list[i + 1])
                break;
            if (list[i] == list[i + 1])
                index++;
        }
        if (index == list.length - 1) {
            System.out.println("\nAll numbers are the same\n" + java.util.Arrays.toString(list));
            System.out.println();
            return true;
        }
        else if (list[index] < list[index + 1]) {
            for (int i = 0; i < list.length - 1; i++) 
                if (list[i] > list[i + 1]) return false;
        }
        else {
            for (int i = 0; i < list.length - 1; i++) 
                if (list[i] < list[i + 1]) return false;
        }
        return true;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.20
public static void selectionSort(double[] list) {
for (int i = list.length - 1; i > 0; i--) {
// Find the minimum in the list[i..list.length-1]
double currentMin = list[i];
int currentMinIndex = i;

for (int j = i - 1; j >= 0; j--) {
if (currentMin < list[j]) {
currentMin = list[j];
currentMinIndex = j;
}
}
// Swap list[i] with list[currentMinIndex] if necessary
if (currentMinIndex != i) {
list[currentMinIndex] = list[i];
list[i] = currentMin;
}
}
}

// -----------------------------------------------------------------------------
    // Ex 7.21
    public static int ballMovement(int slots) {
        int slot = 0;
        for (int i = 1; i < slots; i++) {
            int lr = 1 + (int)(Math.random() * 2);
            if (lr == 1)
                System.out.print("L");
            else if (lr == 2) {
                System.out.print("R");
                slot++;
            }
            else 
                System.out.println("Program ERROR - Call the developer");
        }
        System.out.println();
        return slot;
    }
    public static void slotFilling(int balls, int[] fallen) {
        for (int i = 0; i < balls; i++)
            fallen[ballMovement(fallen.length)]++;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.22 p. 281
    public static void arrangePositions(int array[]) {
        while (true) {
            boolean accept = true;
            for (int i = array.length - 1; i > 0; i--) {
                for (int check = i - 1, diagonal = 1; check >= 0; check--, diagonal++) {
                    if (array[i] == (array[check] - diagonal) || array[i] == (array[check] + diagonal)) {
                        // Swap
                        int temp = array[i];
                        int random = (int)(Math.random() * array.length);
                        array[i] = array[random];
                        array[random] = temp;
                        // Swapped
                        accept = false;
                        i = array.length - 1;
                        break;
                    }
                }
            }
            if (accept) return;
        }
    }
    public static void printChess(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == 1)
                    System.out.print("|Q");
                else 
                    System.out.print("| ");
                a[j]--;
            }
            System.out.print("|\n");
        }
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.24
    public static void deck(String[] a) {
        // 0 - 12 ♠ Spades
        a[0] = "A♠";
        for (int i = 1, n = 2; i <= 9; i++, n++)
            a[i] = n + "♠";
        a[10] = "J♠";
        a[11] = "Q♠";
        a[12] = "K♠";
        // 13 - 25 ♥ Hearts
        a[13] = "A♥";
        for (int i = 14, n = 2; i <= 22; i++, n++)
            a[i] = n + "♥";
        a[23] = "J♥";
        a[24] = "Q♥";
        a[25] = "K♥";
        // 26 - 38 ♣ Clubs
        a[26] = "A♣";
        for (int i = 27, n = 2; i <= 35; i++, n++)
            a[i] = n + "♣";
        a[36] = "J♣";
        a[37] = "Q♣";
        a[38] = "K♣";
        // 39 - 51 ♦ Diamonds
        a[39] = "A♦";
        for (int i = 40, n = 2; i <= 48; i++, n++)
            a[i] = n + "♦";
        a[49] = "J♦";
        a[50] = "Q♦";
        a[51] = "K♦";
    }
    public static int pickingCircle(String[] a) {
        boolean diamonds = false, clubs = false, hearts = false, spades = false;
        int count = 0;
        while (true) {
            count++;
            int pick = (int)(Math.random() * 100) % 52;
            if (pick >= 0 && pick <= 12 && spades == false) {
                spades = true;
                System.out.println(a[pick]);
            }
            else if (pick >= 13 && pick <= 25 && hearts == false) {
                hearts = true;
                System.out.println(a[pick]);
            }
            else if (pick >= 26 && pick <= 38 && clubs == false) {
                clubs = true;
                System.out.println(a[pick]);
            }
            else if (pick >= 39 && pick <= 51 && diamonds == false) {
                diamonds = true;
                System.out.println(a[pick]);
            }
            if (diamonds && clubs && hearts && spades)
                return count;
        }
        
    } 
    
// -----------------------------------------------------------------------------
    // Ex 7.25
    public static int solveQuadratic(double[] abc, double[] roots) {
        if (Math.pow(abc[1], 2) - 4 * abc[0] * abc[2] > 0)
            return 2;
        else if (Math.pow(abc[1], 2) - 4 * abc[0] * abc[2] == 0)
            return 1;
        else 
            return 0;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.26
    public static int[] sTI(String s) {
        while (true) {
            if (s.lastIndexOf(" ") == s.length() - 1)
                s = s.substring(0, s.length() - 1);
            else 
                break;
        }
        int length = 0;
        String dtbvgz = s;
        while (true) {
            if (dtbvgz.contains(" ")) {
                length++;
                dtbvgz = dtbvgz.substring(dtbvgz.indexOf(" ") + 1);
            }
            else {
                length++;
                break;
            }
        }
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            if (s.contains(" ")) {
            array[i] = Integer.parseInt(s.substring(0, s.indexOf(" ")));
            s = s.substring(s.indexOf(" ") + 1);
            }
            else 
                array[i] = Integer.parseInt(s);
        }
        return array;
    }
    public static boolean equals(int[] l1, int[] l2) {
        if (l1.length != l2.length)
            return false;
        for (int i = 0; i < l1.length; i++) {
            if (l1[i] != l2[i])
                return false;
        }
        return true;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.30
    public static boolean isConsecutiveFour(int[] val) {
        for (int i = 0; i < val.length; i++) {
            if (i + 3 < val.length) {
                if (val[i] == val[i + 1] && val[i] == val[i + 2] && val[i] == val[i + 3])
                    return true;
            }
        }
        return false;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.31
    public static int[] marge(int[] l1, int[] l2) {
        int[] m = new int[l1.length + l2.length];
        java.util.Arrays.sort(l1);
        java.util.Arrays.sort(l2);
        for (int i = 0, k1 = 0, k2 = 0; i < m.length;) {
            if (k1 < l1.length && k2 < l2.length) {
                if (l1[k1] < l2[k2]) {
                    m[i] = l1[k1];
                    i++;
                    k1++;
                }
                else if (l2[k2] < l1[k1]) {
                    m[i] = l2[k2];
                    i++;
                    k2++;
                }
                else {
                    m[i] = l1[k1];
                    i++;
                    k1++;
                    m[i] = l2[k2];
                    i++;
                    k2++;
                }
            }
            else if (k1 >= l1.length && k2 < l2.length) {
                m[i] = l2[k2];
                i++;
                k2++;
            }
            else {
                m[i] = l1[k1];
                i++;
                k1++;
            }
        }
        return m;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.32
    public static int partition(int[] l) {
        int pivotIndex = 0;
        boolean lup = true;
        while (lup) {
            lup = false;
            for (int i = 0; i < l.length; i++) {
                if (l[i] <= l[pivotIndex] && i > pivotIndex) {
                    lup = true;
                    int temp = l[pivotIndex];
                    l[pivotIndex] = l[i];
                    l[i] = temp;
                    pivotIndex = i;
                }
                if (l[i] > l[pivotIndex] && i < pivotIndex) {
                    lup = true;
                    int temp = l[pivotIndex];
                    l[pivotIndex] = l[i];
                    l[i] = temp;
                    pivotIndex = i;
                }
            }
        }
        return pivotIndex;
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.34
    public static String sort(String s) {
        String sorted = "";
        while (true) {
            int min = 0;
            if (s.length() > 2) {
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(min) > s.charAt(i))
                        min = i;
                }
                sorted += s.charAt(min);
                if (min < s.length() - 1)
                    s = s.substring(0, min) + s.substring(min + 1);
                else 
                    s = s.substring(0, min);
            }
            else if (s.length() == 2) {
                if (s.charAt(0) < s.charAt(1))
                    return sorted + s;
                else 
                    return sorted + s.charAt(1) + s.charAt(0);
            }
            else 
                return s;
        }
    }
    
// -----------------------------------------------------------------------------
    // Ex 7.35
    public static String wordsDataBase(int index) {
        String[] w = new String[50];
        w[0] = "apple";
        w[1] = "love tits";
        w[3] = "boobies";
        w[4] = "lovely";
        w[5] = "mother";
        w[6] = "family";
        w[7] = "brother";
        w[8] = "sister";
        w[9] = "father";
        w[10] = "program";
        w[11] = "layality";
        w[12] = "counciousness";
        w[13] = "uncouncious";
        w[14] = "uncouncious";
        w[15] = "gloves";
        w[16] = "shoes";
        w[17] = "station";
        w[18] = "ghost";
        w[19] = "ghosttrlephone";
        w[20] = "computer";
        w[21] = "automotive";
        w[22] = "taillight";
        w[23] = "headlight";
        w[24] = "repeater";
        w[25] = "beautifull";
        w[26] = "antenna";
        w[27] = "sophisticated";
        w[28] = "neurology";
        w[29] = "explosion";
        w[30] = "company";
        w[31] = "advertisement";
        w[32] = "device";
        w[33] = "problem";
        w[34] = "solving";
        w[35] = "heart";
        w[36] = "kidney";
        w[37] = "lungs";
        w[38] = "fight";
        w[39] = "woman";
        w[40] = "party";
        w[41] = "description";
        w[42] = "descrimination";
        w[43] = "printer";
        w[44] = "printerprogram";
        w[45] = "parameter";
        w[46] = "argument";
        w[47] = "lighter";
        w[48] = "lighter";
        w[49] = "scheme";
        return w[index];
    }
    public static void besenkaExecution() {
        String word = wordsDataBase((int)(Math.random() * 50)), wtbg = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ')
                wtbg += " ";
            else 
                wtbg += "*";
        }
        java.util.Scanner input = new java.util.Scanner(System.in);
        int misses = 0;
        while (true) {
            if (wtbg.contains("*")) {
                System.out.print("(Guess) Enter a letter in word " + wtbg + " > ");
                char guess = input.next().charAt(0);
                boolean check = false;
                for (int i = 0; i < word.length(); i++) {
                    if (wtbg.charAt(i) == guess) {
                        System.out.println("\t" + guess + " is already in the word");
                        check = true;
                        break;
                    }
                    else if (word.charAt(i) == guess) {
                        if (i < wtbg.length() - 1)
                            wtbg = wtbg.substring(0, i) + guess + wtbg.substring(i + 1);
                        else 
                            wtbg = wtbg.substring(0, i) + guess;
                        check = true;
                    }
                }
                if (check) continue;
                System.out.println("\t" + guess + " is not in the word");
                misses++;
            }
            else {
                System.out.print("\nThe word is " + wtbg + ". You missed " + misses);
                if (misses == 1)
                    System.out.print(" time\n");
                else 
                    System.out.print(" times\n");
                break;
            }
        }
    }
    
}
