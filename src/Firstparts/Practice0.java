package Firstparts;

public class Practice0 {
    public static void main(String[] args){
        //求整数1~100的累加值，跳过个位数为3的
        int ans=0;
        for(int i=1;i<=100;i++){
            if(i%10!=3){
                ans=ans+i;
            }
        }
        System.out.println(ans);
        //--------------------------------
        System.out.println("-----这是分割线-----");
        //--------------------------------
        //循环输出以下结果
        for(int i=1;i<=20;i++){
            int first=2*i,second=5*i;
            ans=first*second;
            System.out.println(first+"*"+second+"="+ans);
        }
        //--------------------------------
        System.out.println("-----这是分割线-----");
        //--------------------------------
        //折纸
        int time=0;
        for(double i=0.08;i<8848130;i*=2){
            time++;
        }
        System.out.println("对折了"+time+"次");
    }
}
