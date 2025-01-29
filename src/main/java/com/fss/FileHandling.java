package com.fss;
 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
public class FileHandling {
 
     
public static void main(String[] arg){
 
    File f=new File("src\\main\\java\\com\\fss\\File.txt");
    try{
       
        //f.deleteOnExit();
 
        Scanner sc= new Scanner(f);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
           
        }
        sc.close();
    }catch(IOException e){
        System.out.println("File not found");
    }
    
 
}
}