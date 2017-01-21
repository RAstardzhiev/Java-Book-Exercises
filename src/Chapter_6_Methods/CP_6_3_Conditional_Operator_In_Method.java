package Chapter_6;
public class CP_6_3_Conditional_Operator_In_Method {
    
    public static void max(int num1, int num2) {
        System.out.print(num1 > num2 ? num1 : num2);
//        System.out.println(num1 > num2 ? num1 : num2);
//        System.out.print(num1 > num2 ? num1 + "\n" : num2 + "\n");
    }
    
    public static void main(String[] args) {
        int j = 5;
        int i = 2;
        System.out.print("The maximum of " + j + " and " + i + " is ");
        max(j, i);
        System.out.print(" And the next print is shown at...");
    }
    
}
