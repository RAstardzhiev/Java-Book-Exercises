package Chapter_5;
public class CP_5_20_d {
public static void main(String[] args) {
int i = 1;
do {
int num = 1;
for (int j = 1; j <= i; j++) {
System.out.print(num + "G");
num += 2;
}
System.out.println();
i++;
} while (i <= 5);
}    
}
