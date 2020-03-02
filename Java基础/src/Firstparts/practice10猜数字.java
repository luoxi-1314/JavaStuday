package Firstparts;

import java.util.Scanner;
import java.util.Random;
public class practice10猜数字 {
    public static void main(String[] args){
        Random ran=new Random();
        Scanner scan=new Scanner(System.in);
        int x=-1;
        int num=ran.nextInt(101);
        System.out.println("猜数字(0~100):");
        x=scan.nextInt();
        while(x!=num){
            if(x>num){System.out.println("数字大了，重新输入:");}
            else{System.out.println("数字小了，重新输入:");}
            x=scan.nextInt();
            if(x==num){System.out.println("恭喜你猜对了！");break;}
        }

    }
}
