package Chapter_4;
public class Ex_4_25 {
    public static void main(String[] args) {
        char ch1 = (char)((int)(65 + Math.random() * 1000 % 26));
        char ch2 = (char)((int)(65 + Math.random() * 1000 % 26));
        char ch3 = (char)((int)(65 + Math.random() * 1000 % 26));
        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        int n3 = (int)(Math.random() * 10);
        int n4 = (int)(Math.random() * 10);
        System.out.println("The random VPN is: " + ch1 + ch2 + ch3 + " " + n1 + n2 + n3 + n4);
    }
}
