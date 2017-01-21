package Chapter_6;
public class Chapter6Methods {
    
    // Ex 6.7 - Page 235
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
    
    // Ex 6.8 - P. 235
    public static double celsiusToFahrengeit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
    
    // Ex 6.9
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
    
    // Ex 6.10
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }
    return true; // Number is prime
    }
    
    // Ex 6.11
    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount <= 5000)
            commission = salesAmount * 0.08;
        else if (salesAmount <= 10000)
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
        else 
            commission = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
        return commission;
    }
    
    // ex 6.12
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        if (ch2 < ch1) {
            char temp = ch1;
            ch1 = ch2;
            ch2 = temp;
        }
        int line = 0;
        while (ch1 < ch2) {
            if (line == numberPerLine) {
                System.out.println();
                line = 0;
            }
            System.out.print(ch1 + " ");
            line++;
            ch1++;
        }
        System.out.println();
    }
    
    // Ex 6_13
    public static double mi_6_13(int i) {
        double result = 0;
        for (int t = 1; t <= i; t++) {
            result += t / (t + 1.0);
        }
        return result;
    }
    
    // Ex 6.14
    public static double ex_6_14(int b) {
        double calc = 1;
        for (int i = 3, c = 1;  i <= 2 * b - 1; i += 2, c++) {
            if (c % 2 == 0)
                calc += 1.0 / i;
            else 
                calc -= 1.0 / i;
        }
        return 4 * calc;
    }
    
    //Ex 615
    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        switch (status) {
            case 1: // Single
                if (taxableIncome < 8350)
                    tax = taxableIncome * 0.1;
                else if (taxableIncome < 33950)
                    tax = 8350 * 0.1 + (taxableIncome - 8350) * 0.15;
                else if (taxableIncome < 82250)
                    tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                else if (taxableIncome < 171550)
                    tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
                else if (taxableIncome < 372950)
                    tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (taxableIncome - 171550 * 0.33);
                else
                    tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
                break;
            case 2: // Married Filing Jointly or Qualifying Widow(er)
                if (taxableIncome < 16700)
                    tax = taxableIncome * 0.1;
                else if (taxableIncome < 67900)
                    tax = 16700 * 0.1 + (taxableIncome - 16700) * 0.15;
                else if (taxableIncome < 137050)
                    tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
                else if (taxableIncome < 208850)
                    tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
                else if (taxableIncome < 372950)
                    tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (taxableIncome - 208850) * 0.33;
                else 
                    tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
                break;
            case 3: // Married Filing Separately
                if (taxableIncome < 8350)
                    tax = taxableIncome * 0.1;
                else if (taxableIncome < 33950)
                    tax = 8350 * 0.1 + (taxableIncome - 8350) * 0.15;
                else if (taxableIncome < 68525)
                    tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                else if (taxableIncome < 104425)
                    tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
                else if (taxableIncome < 186475)
                    tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (taxableIncome - 104425) * 0.33;
                else 
                    tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
                break;
            case 4: // Head of Household
                if (taxableIncome < 11950)
                    tax = taxableIncome * 0.1;
                else if (taxableIncome < 45500)
                    tax = 11950 * 0.1 + (taxableIncome - 11950) * 0.15;
                else if (taxableIncome < 117450)
                    tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
                else if (taxableIncome < 190200)
                    tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
                else if (taxableIncome < 372950)
                    tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (taxableIncome - 190200) * 0.33;
                else 
                    tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        return tax;
    }
    
    // Ex 6.16 *** Conditional operator in return ***
    public static int numberOfDaysInAYear(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? 366 : 365;
    }
    
    // Ex 6.17
    public static void printMatrix(int n) {
        for (int i = 0, line = 0; true; line++) {
            if (line % n == 0) {
                System.out.println();
                if (i == n)
                    break;
                i++;
            }
            int bin = (int)(Math.random() * 10) % 2;
            System.out.printf("%2d", bin);
        }
    }
    
    // Ex 18 - Password Validation
    public static boolean passValidation(String pass) {
        // At least 8 symbols
        if (pass.length() < 8) 
            return false;
        // At least two digits
        int digitCount = 0;
        // Only Digits and Characters
        for (int i = 0; i <= pass.length() - 1; i++) {
            if (pass.charAt(i) < '0' || pass.charAt(i) > '9') {
                if (pass.charAt(i) < 'A' || pass.charAt(i) > 'Z') {
                    if (pass.charAt(i) < 'a' || pass.charAt(i) > 'z')
                        return false;
                }
            }
            if (Character.isDigit(pass.charAt(i)))
                digitCount++;
        }
        return digitCount < 2 ? false : true;
    }
    
    // Ex 6.19
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) ? true : false;
    }
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    // Ex 6.20
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i <s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }
    
    // Ex 6.21
    public static int getNumber(char c) {
        int n = 0;
        switch (c) {
            case 'A':
            case 'B':
            case 'C': n = 2; break;
            case 'D':
            case 'E':
            case 'F': n = 3; break;
            case 'G':
            case 'H':
            case 'I': n = 4; break;
            case 'J':
            case 'K':
            case 'L': n = 5; break;
            case 'M':
            case 'N':
            case 'O': n = 6; break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S': n = 7; break;
            case 'T':
            case 'U':
            case 'V': n = 8; break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z': n = 9; break;
        }
        return n;
    }
    
    // Ex .23
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a || str.charAt(i) == Character.toUpperCase(a))
                count++;
        }
        return count;
    }
    
    // Ex 6.25
    public static String convertMillis(long millis) {
        double allSecconds = millis / 1000;
        int sec = (int)(allSecconds % 60);
        double allMins = allSecconds / 60;
        int min = (int)(allMins % 60);
        double allHours = allMins / 60;
        int hour = (int)(allHours % 24);
        return hour + 2 + ":" + min + ":" + sec;
    }
    
    // Ex 6.26
    public static boolean isPalindrom(int n) {
        String s = "";
        s += n;
        for (int first = 0, last = s.length() - 1; first < last; first++, last--)
            if (s.charAt(first) != s.charAt(last)) 
                return false;
        return true;
    }
    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i <=  n / 2; i++) 
            if (n % i == 0)
                return false;
        return true;
    }
    
    // Ex 6.27
    public static boolean reversePrime(int n) {
        String s = "", back = "";
        s += n;
        for (int i = 0; i < s.length(); i++)
            back = s.charAt(i) + back;
        return isPrimeNumber(Integer.parseInt(back)) ? true : false;
    }
    
    // Ex 6.28
    public static boolean mersennePrime(int p) {
        int result = 1;
        for (int i = 0; i < p; i++)
            result *= 2;
        return (isPrime(result - 1)) ? true : false;
    }
    
    // Ex 6.31
    public static boolean isValid(long number) {
        if (getSize(number) < 13 || getSize(number) > 16) {
            System.out.println("The number must have between 13 and 16 digits");
            return false;
        }
        if ((sumOfDoubledEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)
            return true;
        else 
            return false;
    }
    public static int sumOfDoubledEvenPlace(long number) {
        int sum = 0, p = 0;
        while (true) {
            if (number / 10 == 0)
                break;
            number /= 10;
            p = (int)(number % 10) * 2;
            if (p > 9) {
                int temp = p;
                p = 1 + (temp % 10);
            }
            sum += p;
        }
        return sum;
    }
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (true) {
            sum += number % 10;
            if (number / 10 == 0)
                break;
            number /= 10;
        }
        return sum;
    }
    public static int getSize(long number) {
        String s = "";
        s += number;
        return s.length();
    }
    public static boolean typeValidation(long number)  {
        String s = "";
        s += number;
        if (s.startsWith("4") || s.startsWith("5") || s.startsWith("37") || s.startsWith("6"))
            return true;
        else 
            return false;
    }
    public static String cardTypeFinder(long number) {
        String type = "", n = "";
        n += number;
        if (n.startsWith("4"))
            type = "Visa card";
        else if (n.startsWith("5"))
            type = "Master card";
        else if (n.startsWith("37"))
            type = "American Express card";
        else if (n.startsWith("6"))
            type = "Discover card";
        return type;
    }
    
    // Ex 6.33
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
            return true;
        else 
            return false;
    }
    public static int daysInYear(int year) {
        if (isLeapYear(year))
            return 366;
        else 
            return 365;
    }
    public static String getDateAndMonth(int year, int days) {
// January
        if (days <= 31)
            return "January " + days;
        else 
            days -= 31;
// February
        if (isLeapYear(year) && days <= 29)
            return "February " + days;
        else if (days <= 28)
            return "February " + days;
        else 
            days -= 28;
// March
        if (days <= 31)
            return "March " + days;
        else 
            days -= 31;
// April
        if (days <= 30)
            return "April " + days;
        else 
            days -= 30;
// May
        if (days <= 31)
            return "May " + days;
        else 
            days -= 31;
// June
        if (days <= 30)
            return "June " + days;
        else 
            days -= 30;
// July
        if (days <= 31)
            return "July " + days;
        else 
            days -= 31;
// August
        if (days <= 31)
            return "August " + days;
        else 
            days -= 31;
// September
        if (days <= 30)
            return "September " + days;
        else 
            days -= 30;
// Octomber
        if (days <= 31)
            return "Octomber " + days;
        else days -= 31;
// November
        if (days <= 30)
            return "November " + days;
        else 
            return "December " + (days - 30);
    }
    
    // Ex 6.35
    public static double areaOfPentagon(double side) {
        return 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
    }
    public static String DotInverse(String forInverse) {
        return forInverse.substring(0, forInverse.indexOf(",")) + "." + forInverse.substring((forInverse.indexOf(",") + 1));
    }
    
    // Ex 6.36
    public static double polygonArea(int numberOfSides, double side) {
        return numberOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSides));
    }
    
    // Ex 6.37
    public static String format(int number, int width) {
        String n = "";
        n += number;
        if (n.length() >= width)
            return n;
        for (int i = width - n.length(); i > 0; i--)
            n = "0" + n;
        return n;
    }
    
    // Ex 6.38
    public static char upperCaseLetter() {
        return (char)(65 + Math.random() * 100 % 26);
    }
    public static char lowerCaseLetter() {
        return (char)(97 + Math.random() * 100 % 26);
    }
    
    // Ex 6.39
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) > 0 ? true : false;
    }
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) == 0 ? true : false;
    }
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x2 > x0 && x2 < x1 && y2 > y0 && y2 < y1 || x2 > x1 && x2 < x0 && y2 > y1 && y2 < y0) ? true : false;
    }
    
}
