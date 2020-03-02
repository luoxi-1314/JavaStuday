package Secondparts;

public class InterfaceDemo0 {
    public static void main(String[] args) {
        A a=new B();
        a.method1();
        a.method2();
        B b=new B();
        b.method1();
        b.method2();
    }
}
//接口是抽象化的类 里面没有完整方法
interface A{
    void method1();
    void method2();
}
//类可以被继承 接口可以被实现
class B implements A{
    public void method1(){
        System.out.println("method");
    }
    public void method2(){
        System.out.println("method");
    }
}