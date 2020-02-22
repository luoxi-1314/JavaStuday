package Firstparts;

import java.util.Scanner;
public class StringStudy {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=scanner.next();
        //字符串长度
        System.out.println("长度:"+str.length());
        //字符串各个位置上的字符
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        //查找子字符串位置
        System.out.println(str.indexOf("love"));//给出第一个子字符串
        System.out.println(str.lastIndexOf("love"));//从后给出第一个子字符串
        //如果查找不到输出-1
        //获取子字符串
        System.out.println(str.substring(1));
        //字符串判断
        System.out.print("是否以www开头:");
        System.out.println(str.startsWith("www"));
        System.out.print("是否以com结尾:");
        System.out.println(str.endsWith("com"));
        //----------------------------
        System.out.println("----------------------------");
        //----------------------------
        String s1="asdf";
        String s2="asdf";
        String s3=new String("asdf");
        String s4=new String("ASDF");
        System.out.println(s1==s2);
        System.out.println(s1==s3);//这与字符串存储结构有关
        //判断字符串相等  -s.equals-
        System.out.println(s1.equals(s3));
        //忽略大小写判断
        System.out.println(s1.equalsIgnoreCase(s4));
        //字符串大小比较（字符串排序）
        System.out.println(str.compareTo(s1));
        //判断是否含有某个字符串
        System.out.print("是否含有某个字符串:");
        System.out.println(str.contains("love"));
        //判断字符串是否为空
        String a=" ";
        //String b=null;
        System.out.print("是否为空:");
        System.out.println(a.isEmpty());
        //System.out.println(b.isEmpty());//空对象不能调用方法
        //--------------------
        System.out.println("--------------------");
        //字符串大小写转换
        System.out.print("大写:");
        System.out.println(str.toUpperCase());
        System.out.print("小写:");
        System.out.println(str.toLowerCase());
        //字符串分割
        String strs[]=str.split("\\.");// \.转义
        /*for(int i=0;;i++) {
            System.out.println(strs[i]);
        }*/
        //去除空格
        System.out.println(str.trim());
        //字符替换
        System.out.println(str.replace('w','x'));
        System.out.println(str.replace("hao","baidu"));
    }
}
