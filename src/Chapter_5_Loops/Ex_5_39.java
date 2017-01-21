package Chapter_5;
public class Ex_5_39 {
public static void main(String[] args) {
    
    // 10 000 sales = 900; + 5000 = 5 900;
    
    int above = 1;
    
    while (true) {
        if (above * 0.12 + 5900 >= 30000)
            break;
        above++;
    }
    
    System.out.println("Target sales to acheive annual salary of 30 000 is sales for the sum of $ " + (10000 + above));
    
}    
}
