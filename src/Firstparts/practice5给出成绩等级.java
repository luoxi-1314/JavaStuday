package Firstparts;

import java.util.Scanner;
public class practice5给出成绩等级 {
    public static void main(String[] args){
        System.out.println("请输入分数：");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("相应的等级：");
        if(a>=90 & a<=100){
            System.out.println("优秀");
        }else if(a>=80 & a<=89){
            System.out.println("良好");
        }else if(a>=70 & a<=79){
            System.out.println("中等");
        }else if(a>=60 & a<=69){
            System.out.println("及格");
        }else if(a>=0 & a<=59){
            System.out.println("不及格");
        }
    }
}
