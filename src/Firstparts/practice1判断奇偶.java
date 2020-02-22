package Firstparts;

import java.util.Scanner;
public class practice1判断奇偶 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        boolean b=true;
        do{
            System.out.println("输入一个整数：");
            int num=s.nextInt();
            if(num%2==0){
                System.out.println("偶数");
            } else{
                System.out.println("奇数");
            }
            System.out.println("输入n以中断程序否则继续");
            char a='0';
            try {
                a = (char) System.in.read();
            }catch(Exception e){
                e.printStackTrace();
            }
            if(a=='n'){
                b=false;
            }
        }while(b);
    }
}
