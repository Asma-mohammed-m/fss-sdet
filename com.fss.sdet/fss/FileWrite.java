package fss-sdet.com.fss.sdet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWrite {

    public static void main(String[] args) {
        File f=new File("./write.txt");
        try {
            f.createNewFile();
            FileWriter fw=new FileWriter("./write.txt");
            fw.append("File Write Check");
            fw.close();
    
    
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }
}
