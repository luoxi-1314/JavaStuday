package Secondparts;

import java.util.ArrayList;

public class Demo集合存储类 {
    public static void main(String[] args){
        ArrayList<Student> a1=new ArrayList<Student>();
        Student s=new Student(18,"JOJO");
        a1.add(s);
        a1.add(new Student(17,"kiki"));
        for(Student temp:a1){
            System.out.println(temp.getAge()+"-"+temp.getName());
        }
    }
}
