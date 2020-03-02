package Firstparts;

public class practice2阶乘 {
    public static void main(String[] args){
        long ans=0;
        for(int i=1;i<=20;i++){
            long num=1;
            for(int j=i;j>0;j--){
                num*=j;
            }
            ans+=num;
        }
        System.out.println(ans);
    }
}
