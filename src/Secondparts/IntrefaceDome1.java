package Secondparts;

public class IntrefaceDome1 {
    public static void main(String[] args){
        Teacher teacher=new Teacher();
        teacher.cook();
        teacher.zhaosheng();
        teacher.teach();
    }
}

class Person1{
    private String name;
    private int age;
}
//通过接口扩展功能
interface Chushi{
    void cook();
}
interface ZhaoSheng{
    void zhaosheng();
}
class Teacher extends Person1 implements Chushi,ZhaoSheng{
        public void teach(){
            System.out.println("教学");
        }
        public void cook(){
            System.out.println("做饭");
        }
        public void zhaosheng(){
            System.out.println("招生");
        }
}

class Student1 extends Person1{
    public void learn(){
        System.out.println("学习");
    }
}