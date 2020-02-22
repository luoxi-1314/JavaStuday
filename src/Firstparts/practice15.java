package Firstparts;

import java.util.Scanner;
public class practice15 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("判断字符串是否对称");
        System.out.println("请输入字符串:");
        String str=scanner.nextLine();
        boolean check=true;
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                check=false;
                break;
            }
        }
        System.out.println(check);
    }
}
