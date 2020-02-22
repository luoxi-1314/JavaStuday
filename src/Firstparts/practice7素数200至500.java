package Firstparts;

public class practice7素数200至500 {
    public static void main(String[] args){
        for(int i=200;i<=500;i++){
            boolean check=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    check=false;
                }
            }
            if(check){
                System.out.print(i+" ");
            }
        }
    }
}
