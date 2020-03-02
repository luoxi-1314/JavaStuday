package Secondparts;

public class InterfaceDemo2 {
    public static void main(String[] args){
        Plane p=new Plane();
        p.transit();

        Car c=new Car();
        c.transit();
    }
}

abstract class Vehicle{
    private float velocity;
    private float weight;
    private String name;
    private String id;

    public abstract void transit();
}
interface battle{
    void attack();
}

class Plane extends Vehicle implements battle{
    public void transit(){
        System.out.println("空中运输");
    }
    public void attack(){
        System.out.println("发射炮弹");
    }
}

class Car extends Vehicle{
    public void transit(){
        System.out.println("陆地运输");
    }
}