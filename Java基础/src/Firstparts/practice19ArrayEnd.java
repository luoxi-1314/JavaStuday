package Firstparts;

import java.util.Scanner;
public class practice19ArrayEnd {
    public static void main(String[] args) {
        int[] score = new int[]{72, 87, 65, 18, 87, 91, 53, 82, 71, 93, 76, 68};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("平均分:" + sum / score.length);
        int max = score[0], min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }
        sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        sum = sum - max - min;
        System.out.println("除去最大最小平均分:" + sum / (score.length - 2));
        Scanner scanner=new Scanner(System.in);
        int[] student=new int[8];
        System.out.println("输入八个学生的成绩:");
        for(int i=0;i<student.length;i++){
            student[i]=scanner.nextInt();
        }
        max=student[0];
        min=student[0];
        for (int i = 0; i < student.length; i++) {
            if (student[i] > max) max = student[i];
            if (student[i] < min) min = student[i];
        }
        sum = 0;
        for (int i = 0; i < student.length; i++) {
            sum += student[i];
        }
        System.out.println("学生的总分:"+sum);
        System.out.println("学生的平均分:"+sum/student.length);
        System.out.println("学生的最高分:"+max);
        System.out.println("学生的最低分:"+min);
    }
}
