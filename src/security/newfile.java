/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;
import java.io.*;
/**
 *
 * @author Prashanth.M
 */
public class newfile {
    void createfile() throws IOException
    {
         boolean flag=false;
        File stockFile=new File("d://stockFile/mydoc/aa.txt");
        
        try{
            flag=stockFile.createNewFile();
            
        }
        catch(SecurityException ioe){
            System.out.println("Error!!!!... while creating file..." +ioe);
        }
    System.out.println("stock file"+stockFile.getPath()+"file is created...");
    }
    public static void main(String[] args) throws IOException{
      //  boolean flag=false;
        newfile obfile=new newfile();
        obfile.createfile();
    }
        /*System.out.println("enter the file name");
        File stockFile=new File("d://stockFile/mydoc");
        
        try{
            flag=stockFile.mkdir();
            
        }
        catch(SecurityException ioe){
            System.out.println("Error!!!!... while creating file..." +ioe);
        }
    System.out.println("stock file"+stockFile.getPath()+"file is created...");*/
    }
    
