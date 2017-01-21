package Chapter_5;
public class CP_5_27_b {
public static void main(String[] args) {
for (int i = 1; i < 4; i++) {
for (int j = 1; j < 4; j++) {
if (i * j > 2)
continue; //Here the result is the same if change --> "continue" with "break" <--
System.out.println(i * j);
}
System.out.println(i);
}
}    
}
