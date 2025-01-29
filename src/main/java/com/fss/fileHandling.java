package com.fss;

import java.io.File;
import java.io.FileWriter;


public class fileHandling {
    public static void main(String[] args) {
        try {
            File f = new File("./test.txt");
            f.createNewFile();
           FileWriter fw = new FileWriter(f);
            fw.append("Velmurgan");
            fw.close();
        //f.deleteOnExit();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
    
}
