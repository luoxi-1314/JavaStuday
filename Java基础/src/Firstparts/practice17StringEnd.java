package Firstparts;

import java.util.Scanner;
import java.util.Random;
public class practice17StringEnd {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int code1=random.nextInt(10);
        int code2=random.nextInt(10);
        int code3=random.nextInt(10);
        int code4=random.nextInt(10);
        String code=""+code1+code2+code3+code4;
        System.out.println("验证码:"+code+"");
        for(int i=0;i<5;i++){
            System.out.println("请输入验证码");
            String check=scanner.nextLine();
            if(code.equals(check)){
                System.out.println("输入正确");break;
            }else{
                if((4-i)==0){System.out.println("您的账号已锁定");break;}
                System.out.println("输入错误，还剩下"+(4-i)+"次机会");
            }
        }
    }
}
