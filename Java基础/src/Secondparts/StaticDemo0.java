package Secondparts;

public class StaticDemo0 {
    public static void main(String[] args){
        Person P1=new Person("luoxi",18,"China");
        Person P2=new Person("Peter",20,"USA");
        P1.country="China";
        System.out.println(P1.name+" "+P1.age+" "+P1.country);//静态变量保留一个
        System.out.println(P2.name+" "+P2.age+" "+P2.country);
        Person.show1();
        Person.show2(P2);
    }
}

class Person{
    public static String country;
    public String name;
    public int age;
    public Person(String name,int age,String country){
        this.name=name;
        this.age=age;
        this.country=country;
    }
    public static void show1(){
        System.out.println(country);   //静态方法只能访问静态变量
    }
    public static void show2(Person p){
        System.out.println(p.name+" "+p.age);  //通过对象可以访问
    }
}


