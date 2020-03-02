package Secondparts;
class Player{
    private String name;
    public String getName(){
        return name;
    }
    int life;
    int level;
    int damage;
    int HP;
    int score;
    public void move(){
        System.out.println("移动坦克");
    }
    private void show(){
        System.out.println("ID");
}
    public void myshow(){
        show();
    }
    public Player(String name,int level, int HP,int damage,int life,int score){
        System.out.println(name+"构造完成");
        this.name=name;this.level=level;this.HP=HP;this.damage=damage;this.life=life;this.score=score;
    }
}
class Enemy{
    int Type;
    int damage;
    int HP;
}
public class tankPlus {
    public static void main(String[] args){
        Player P1=new Player("god",1,100,10,3,0);
        Player P2=new Player("ahhhh",2,200,20,4,0);
        System.out.println("P1 name:"+P1.getName());
        P1.move();
        Enemy E1=new Enemy();
        P1.myshow();
    }
}
