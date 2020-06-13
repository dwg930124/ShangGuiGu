import java.util.Scanner;

/**
 * @author DWG
 * @create 2020-06-12-15:53
 */
public class StudentScore {
    public static void main(String[] args) {
        int maxScore = 0;
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生人数：");
        int number = scanner.nextInt();
        int[] score = new int[number];
        System.out.println("请输入" + number + "个成绩：");
        for (int i = 0; i < number; i++) {
            score[i] = scanner.nextInt();
            if (score[i] > maxScore)
                maxScore = score[i];
        }

        System.out.println("最高分是："+maxScore);
        for (int i = 0;i<number;i++) {
            int temp = maxScore - score[i];
            if (temp <= 10) {
                grade = 'A';
            }else if (temp <= 20){
                grade = 'B';
            }else if (temp <= 30){
                grade = 'C';
            }else {
                grade = 'D';
            }
            System.out.println("student " + i + " score is " + score[i] + " grade is " + grade);
        }
    }
}
