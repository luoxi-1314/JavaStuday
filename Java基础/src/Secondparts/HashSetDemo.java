package Secondparts;

import java.util.HashSet;

//HashSet  TreeSet : 不重复  无序
//了解哈希值
public class HashSetDemo {
    public static void main(String[] args){
        HashSet set=new HashSet();
        set.add("asd");
        set.add("asd");
        set.add("aaa");
        set.add("123");

        for(Object o :set){
            System.out.println(o+" ");
        }
        System.out.println();
    }
}
