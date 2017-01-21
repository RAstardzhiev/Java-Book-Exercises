package Chapter_5;
public class While_Test {
    public static void main(String[] args) {
        
        int count = 1;
        int book = 0;
        
        while (count <= 100 && book < 100) {
            System.out.println("Count 1<=100: " + count + "\t\t\tCount 0<100: " + book);
            count++; book++;
        }
        
    }
}
