package Chapter_5;
public class Ex_5_43 {
public static void main(String[] args) {
    
    int count = 0;
    
    for (int n2 = 1; n2 <= 7; n2++) {
        for (int n1 = 1; n1 <= 7; n1++) {
            if (n1 <= n2)
                continue;
            System.out.println(n2 + " " + n1 + "\n");
            count++;
        }
    }
    System.out.println("The total number of all combinations is " + count);
}    
}
