package Firstparts;

public class TypeCast {
    public static void main(String[] args){
        byte a=100;
        short b=a;
        int c=b;
        long d=c;
        float e=d;
        double f=e;
        double h='a';
        long g=(long) 5.6f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(h);
        System.out.println(g);
    }
}
