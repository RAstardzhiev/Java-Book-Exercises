package Chapter_5;
public class CP_5_19_For_Loop_Nested {
public static void main(String[] args) {
int count = 1;
for (int i = 0; i < 10; i++) 
    for (int j = 0; j < i; j++, count++)
    System.out.println("Count: " + count + "\t" + j);
}    
}
