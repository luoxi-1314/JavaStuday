package Firstparts;

import java.util.Scanner;
public class practice4字符转换 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char a=str.charAt(0);//好坑啊！！！不能直接输入字符
        if((int)a>=97 & (int)a<=122){
            a=(char)((int)a-32);
            System.out.println(a);
        }else{
            System.out.println(a);
        }
    }
}
