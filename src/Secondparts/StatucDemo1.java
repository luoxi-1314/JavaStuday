package Secondparts;

public class StatucDemo1 {
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.radius=2;
        System.out.println(c1.getC());
    }
}

class Circle{
    public float radius;
    public static float pi=3.1415926f;  //静态  只有一个 节约内存
    public float getC(){
        return 2*pi*radius;
    }
}