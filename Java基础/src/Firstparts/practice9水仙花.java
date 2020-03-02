package Firstparts;

public class practice9水仙花 {
    public static void main(String[] args){
        for(int i=100;i<1000;i++){
            int a=i/100;
            int b=i/10-10*a;
            int c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){System.out.println(i);}
        }
    }
}
