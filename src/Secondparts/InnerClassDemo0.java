package Secondparts;
//匿名内部类
public class InnerClassDemo0 {
    public static void main(String[] args){
        Product p=new Apple();
        System.out.println(p.getName());
        System.out.println("------------------------------");
        System.out.println(
                new Product(){
                    public float getPrice(){
                        return 3.3f;
                    }
                    public String getName(){
                        return "苹果";
                    }//定义了一个实现Product接口的子类，但是这个类没有名字所以叫匿名内部类
                }.getName()
        );
    }
}

interface Product{
    float getPrice();
    String getName();
}

class Apple implements Product{
    public float getPrice(){
        return 3.3f;
    }
    public String getName(){
        return "苹果";
    }
}