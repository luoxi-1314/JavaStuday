package Firstparts;

import java.util.Scanner;
public class practice11StringBegin {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String s1=scanner.nextLine();
        System.out.println("输入子串:");
        String s2=scanner.nextLine();
        int length=0;
        while(true){
            int location=s1.indexOf(s2);
            if(location==-1)break;
            System.out.println("字串位置:"+(location+length));
            s1=s1.substring(location+s2.length());
            length+=(location+s2.length());
        }
    }
}
