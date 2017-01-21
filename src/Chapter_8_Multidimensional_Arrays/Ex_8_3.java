package Chapter_8;
public class Ex_8_3 {
public static void main(String[] args) {
// Students' answers to the questions
char[][] answers = {
{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

// Key to the questions
char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
int[][] cc = new int[8][2];
// Grade all answers
for (int i = 0; i < answers.length; i++) {
// Grade one student
int correctCount = 0;
for (int j = 0; j < answers[i].length; j++) {
if (answers[i][j] == keys[j])
correctCount++;
}

cc[i][0] = i;
cc[i][1] = correctCount;
}
for (int j = 0; j < cc.length; j++) {
    for (int i = 1; i < cc.length; i++) {
        if (cc[i - 1][1] > cc[i][1]) {
            int temp = cc[i][1];
            cc[i][1] = cc[i - 1][1];
            cc[i - 1][1] = temp;
            int index = cc[i][0];
            cc[i][0] = cc[i - 1][0];
            cc[i - 1][0] = index;
        }
        }
}
for (int i = 0; i < cc.length; i++)
    System.out.println("Student " + cc[i][0] + "'s correct count is " + cc[i][1]);
}
}
