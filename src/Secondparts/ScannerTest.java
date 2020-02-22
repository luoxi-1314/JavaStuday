package Secondparts;
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String usernmae=null;
        String password=null;
        System.out.println("请输入用户名:");
        usernmae=scanner.nextLine();
        System.out.println("请输入密码:");
        password=scanner.nextLine();
        if(usernmae.equals("root")&&password.equals("123456")){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }
}
