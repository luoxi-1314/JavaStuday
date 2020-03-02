package Firstparts;

import java.util.Date;
public class PrintTime {
    public static void main(String[] args){
        for(int i=0;i<100;i++){
            System.out.println(new Date());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
