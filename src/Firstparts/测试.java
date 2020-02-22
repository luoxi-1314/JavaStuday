package Firstparts;

public class 测试 {
    public static void main(String[] args){
        int i=1000;
        int ans=0;
        while(i%21!=0){
            i+=3;
            ans++;
        }
        System.out.println(ans);
    }
}
