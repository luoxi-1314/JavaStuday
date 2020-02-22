package Firstparts;

import java.util.Scanner;
public class practice16 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("反转字符串:");
        String s1=scanner.nextLine();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        System.out.println(s2);
    }
}
