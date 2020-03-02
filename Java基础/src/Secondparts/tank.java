package Secondparts;
import java.util.Scanner;
public class tank {
    public static void main(String[] args){
        int P1life=3;
        int score=0;
        int level=1;
        String name="打不死的小强";
        int tanklevel=1;
        int tankdamage=10;
        int tankHP=100;
        int enemy1HP=100;
        int enemy1damage=10;
        System.out.println("控制移动");
        System.out.println("控制攻击");
        enemy1HP-=tankdamage;
        if(enemy1HP<=0){
            System.out.println("敌人死亡");
            score+=1;
        }
        tankHP-=enemy1damage;
        if(tankHP<=0){
            if(P1life>0){
                System.out.println("复活P1");
                P1life--;
            }else{
                System.out.println("Game over");
            }
        }
    }
}
