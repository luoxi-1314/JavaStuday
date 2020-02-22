package Firstparts;

import java.util.Scanner;
public class practice12{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String s1=scanner.nextLine();
        System.out.println("输入子串:");
        String s2=scanner.nextLine();
        int num=0;
        while(true){
            int weizhi=s1.indexOf(s2);
            if(weizhi>=0){
                num++;
                s1=s1.substring(weizhi+s2.length());
            }else{break;}
        }
        System.out.println("出现次数:"+num);
    }
}
