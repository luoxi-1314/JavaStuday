package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args){
        try{
            //后面，加上true不会覆盖
            FileOutputStream output=new FileOutputStream("C:\\Users\\洛\\Desktop\\javastudy\\Text\\T1\\text.txt");
            output.write('s');
            String s="中国666";
            output.write(s.getBytes());
            output.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
