package Secondparts;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[]args){
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
        a1.add("小红");
        a1.add("小明");
        System.out.println(a1.get(1));
        a2.addAll(a1);
        a2.add(0,"Jack");
        for(int i=0;i<a2.size();i++){
            System.out.print(a2.get(i)+" ");
        }
        System.out.println();
        a2.remove(1);
        a2.remove("Jack");
        System.out.println(a2.get(0));
        ArrayList number=new ArrayList();
        number.add(123);
        number.add(234);
        number.add(432);
        int result=0;
        for(int i=0;i<number.size();i++){
            result+=(int)number.get(i);    //使用前可以转化类型
        }
        System.out.println(result);
        System.out.println("-------------------------------------");
        //遍历器
        Iterator iterator=number.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------------");
        for(Object o :number){
            System.out.println(o);
        }
        //Vector和ArrayList用法几乎相同，不同之处在于Vector的线程是安全的
        //LinkedList主要便于插入数据
    }
}
