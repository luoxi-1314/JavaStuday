package IO;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\洛\\Desktop\\javastudy\\text.txt");
        File p=new File("C:\\Users\\洛\\Desktop\\javastudy\\Text");
        File f1=new File("C:\\Users\\洛\\Desktop\\javastudy\\Text\\text1");
        File p1=new File("C:\\Users\\洛\\Desktop\\javastudy\\Text\\T1\\T2");



//        System.out.println(f1.getAbsolutePath()); //绝对路径
//        System.out.println(p1.getPath());
//        File p2=new File("\\Text\\123");
//        p2.mkdir();
//        System.out.println(p2.getAbsolutePath());
//        p2.delete();
    }
    public void method(){
//        File f1=new File("C:\\Users\\洛\\Desktop\\javastudy\\Text\\text1");
//        File p1=new File("C:\\Users\\洛\\Desktop\\javastudy\\Text\\T1\\T2");
//        boolean isSuccess=f1.createNewFile();
//        System.out.println(isSuccess);
//        System.out.println(p1.mkdirs());//mkdirs可创建多级目录  mkdir创建一个
//        System.out.println(p1.delete());
//        f1.delete();
//        f1.renameTo(new File("C:\\Users\\洛\\Desktop\\javastudy\\Text\\text2"));
//        f1.renameTo(new File("C:\\Users\\洛\\Desktop\\javastudy\\Text\\T1\\text3"));
    }
    public void panduan(){
        File f=new File("C:\\Users\\洛\\Desktop\\javastudy\\text.txt");
        File p=new File("C:\\Users\\洛\\Desktop\\javastudy\\Text");
        System.out.println(f.isDirectory());
        System.out.println(p.isDirectory());
        System.out.println("--------------------------------------");
        System.out.println(f.isFile());
        System.out.println(p.isFile());
        System.out.println("--------------------------------------是否存在");
        System.out.println(f.exists());
        System.out.println(p.exists());
        System.out.println("--------------------------------------是否可读");
        System.out.println(f.canRead());
        System.out.println(p.canRead());
        System.out.println("--------------------------------------是否可写");
        System.out.println(f.canWrite());
        System.out.println(p.canWrite());
    }
}
