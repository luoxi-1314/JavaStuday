package Secondparts;

public class Demo可变参数 {
    public static void main(String[] args){
        System.out.println(add(1,2,3,4,6));
    }

    public static int add(int... args){
        int result=args[0];

        for(int i=1;i<args.length;i++){
            result+=args[i];
        }
        return result;
    }
}
