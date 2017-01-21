package Chapter_5;
public class CP_5_27_a {
public static void main(String[] args) {
    for (int i = 1; i < 8; i++) {
        for (int j = 1; j < 8; j++) {
        if (i * j > 3)
        break;
        System.out.println("i * j = " + i * j + "\t| i = " + i);
        }
    System.out.println("i = " + i);
}
}    
}
