package Secondparts;

import java.util.ArrayList;
//处理异常
public class TryCatch {
    public static void main(String[] args){
        try{
            ArrayList list=new ArrayList();
            System.out.println(list.get(0));
        }catch(IndexOutOfBoundsException a){
            a.printStackTrace();
        }
        System.out.println("233");

    }
}
