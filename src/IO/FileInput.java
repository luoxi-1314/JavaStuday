package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInput {
    public static void main(String[] args){
        try{
            FileInputStream input=new FileInputStream("C:\\Users\\洛\\Desktop\\javastudy\\Text\\text2");
            int a=-1;
            while (true){
                a=input.read();
                if(a==-1)break;
                System.out.print((char) a);
            }
            input.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
