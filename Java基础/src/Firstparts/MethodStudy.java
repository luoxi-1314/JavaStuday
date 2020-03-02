package Firstparts;

public class MethodStudy {
    public static void main(String[] args){
        int x=5,y=10,z=-3;
        System.out.println(Max(x,y));
        System.out.println(abs(z));
        createEnemy(3);
    }
    public static void createEnemy(){
        System.out.println("1.创建模型");
        System.out.println("2.设置位置");
        System.out.println("3.添加特效");
        System.out.println("4.添加AI");
    }
    public static void createEnemy(int a){
        for(int i=0;i<a;i++)createEnemy();
    }
    public static int Max(int a,int b){
        if(a>b)return a;else return b;
    }
    public static int abs(int a){
        if(a<0)return -a;else return a;
    }
}
