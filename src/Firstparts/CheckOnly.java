package Firstparts;

public class CheckOnly {
    public static void main(String[] args){
        int num[]={1,2,2,3,5,5,1};
        int ans=0;
        for(int i=0;i<7;i++){
            ans=ans^num[i];
        }
        System.out.println(ans);
    }
}
