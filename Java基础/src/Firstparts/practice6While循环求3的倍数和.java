package Firstparts;

public class practice6While循环求3的倍数和 {
    public static void main(String[] args){
        int i=1,ans=0;
        while(i<=200){
            if(i%3==0){ans+=i;}
            i++;
        }
        System.out.println(ans);
    }
}
