package Firstparts;

public class practice8买鸡 {
    public static void main(String[] args){
        int ans=0;
        for(int i=0;i<=20;i++){
            for(int j=0;j<=33;j++) {
                for (int k = 0; k <= 300; k += 3) {
                    if ((5 * i + 3 * j + k / 3) == 100 & i+j+k==100) {
                        System.out.println("公鸡:"+i+" "+"母鸡:"+j+" "+"小鸡:"+k);
                        ans++;
                    }
                }
            }
        }
        System.out.println("方法共计"+ans+"种");
    }
}
