package Firstparts;

import java.util.Scanner;
public class practice3从小到大 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max=0;
        if(a>=b){
            if(a>=c){
                max=a;
            }else{
                max=c;
            }
        }else {
            if (b >= c) {
                max = b;
            } else {
                max = c;
            }
            }
        System.out.println(max);
        }
}
