package Firstparts;

public class JudgmentStatement {
    public static void main(String[] args){
        int blood=2,kill=4;
        if(blood<=0){
            System.out.println("You've been dead");
            System.out.println("Game Over!");
        }else{
            System.out.println("Continue");
        }
        if(kill==1){
            System.out.println("First blood");
        }else if(kill==2){
            System.out.println("Double kill");
        }else if(kill==3){
            System.out.println("Triple kill");
        }else if(kill==4){
            System.out.println("Quartic kill");
        }else if(kill==5){
            System.out.println("Penta kill");
        }
        //--------------------------------
        System.out.println("-----这是分割线-----");
        //--------------------------------
        int money=100;
        switch(money){
            case 100:
                System.out.println("You got 100");
                break;
            case 200:
                System.out.println("You got 200");
                break;
            case 500:
                System.out.println("You got 500");
                break;
            default:
                System.out.println("None!");
                break;
        }
        //--------------------------------
        System.out.println("-----这是分割线-----");
        //--------------------------------
        while(money>0){
            System.out.println("You got a sword");
            money-=100;
        }
        //--------------------------------
        System.out.println("-----这是分割线-----");
        //--------------------------------
        int k=3;
        do{
            System.out.println("我也不知道输出啥好");
            k--;
        }while(k>0);
        //--------------------------------
        System.out.println("-----这是分割线-----");
        //--------------------------------
        for(int i=0;i<5;i++){
            System.out.print(i+" ");
        }
        /*int l=0;
        for(;;l++){
            System.out.println(l);
        }*/
    }
}
