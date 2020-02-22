package Firstparts;

public class CompareAndLogicAndThree {
    public static void main(String[] args){
        int a=5,b=7;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        //--------------------------------
        System.out.println("-----这是分割线-----");
        //--------------------------------
        System.out.println(a!=b && a<=b);
        System.out.println(a!=b & a<=b);
        System.out.println(a==b || a>=b);
        System.out.println(a!=b ^ a<=b);
        System.out.println(!(a==b));
        //--------------------------------
        System.out.println("-----这是分割线-----");
        //--------------------------------
        System.out.println(7>8?"7>8":"7<8");
    }
}
