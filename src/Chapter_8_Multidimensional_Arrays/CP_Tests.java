package Chapter_8;
public class CP_Tests {
    public static void main(String[] args) {
        
//------------------------------------------------------------------------------
// 8.1
        int[][] arvar = {
        {1, 2, 3, 4, 5}, 
        {2, 3, 4, 5, 6}, 
        {3, 4, 5, 6, 7}, 
        {4, 5, 6, 7, 8}
        };
        
/*------------------------------------------------------------------------------
// 8.3 --> Output: 
//|array[0][1] is 2
//|array[0].length is 2
//|array[1].length is 6
int[][] array = new int[5][6];
int[] x = {1, 2};
array[0] = x;
System.out.println("array[0][1] is " + array[0][1]);
System.out.println("array[0].length is " + array[0].length);
System.out.println("array[1].length is " + array[1].length);
*/

/*------------------------------------------------------------------------------
// 8.5 --> Output: 
// |6 5 |
// |4 3 |
// |2 1 |
int[][] array = {{1, 2}, {3, 4}, {5, 6}};
for (int i = array.length - 1; i >= 0; i--) {
    for (int j = array[i].length - 1; j >= 0; j--)
        System.out.print(array[i][j] + " ");
System.out.println();
}
*/

/*------------------------------------------------------------------------------
// 8.6 --> Output: 
// |9|
int[][] array = {{1, 2}, {3, 4}, {5, 6}};
int sum = 0;
for (int i = 0; i < array.length; i++)
sum += array[i][0];
System.out.println(sum);
*/

/*------------------------------------------------------------------------------
// 8.7 --> Output: 
// |2
// |4
int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
System.out.println(m1(array)[0]);
System.out.println(m1(array)[1]);
*/

/*------------------------------------------------------------------------------
// 8.10 --> Output: 
// |1|
// |8|
int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6},{7, 8}}};
System.out.println(array[0][0][0]);
System.out.println(array[1][1][1]);
*/
        String t = "1/2/3/4/5/6/7/8/9/";
        System.out.println(t.substring(t.lastIndexOf("/", t.length() - 2) + 1, t.lastIndexOf("/")));
        String y = "";
        System.out.println(y.length());
        int i = 5;
        String s = "bank 2 bank 5 bank 3";
        System.out.println(!s.contains("" + i) ? "!Works" : "!NotWorking");
}
    
// Methods -->
    
public static int[] m1(int[][] m) {
int[] result = new int[2];
result[0] = m.length;
result[1] = m[0].length;
return result;
        
    }
}
