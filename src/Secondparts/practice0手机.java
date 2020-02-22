package Secondparts;
class Phone{
    private String name;
    private int type;
    private int electric;

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getType(){return type;}
    public void setType(int type){this.type=type;}
    public int getElectric(){return electric;}
    public void setElectric(int electric){this.electric=electric;}
    public Phone(String name,int type,int electric){
        this.name=name;this.electric=electric;this.type=type;
    }
}
public class practice0手机 {
    public static void main(String[] args){
        Phone P1=new Phone("iPhone",10,100);
        System.out.print(P1.getName()+" 当前版本:");
        System.out.println(P1.getType());
        System.out.println("系统升级中");
        P1.setType(11);
        System.out.println("当前系统版本："+P1.getType());
        System.out.println("系统更新完成");
    }
}
