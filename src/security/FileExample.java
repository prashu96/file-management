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
public class FileExample {
    void createdir()
    {
         boolean flag=false;
        File stockFile=new File("d://stockFile/mydoc/aa");
        
        try{
            flag=stockFile.mkdir();
            
        }
        catch(SecurityException ioe){
            System.out.println("Error!!!!... while creating file..." +ioe);
        }
    System.out.println("stock file"+stockFile.getPath()+"file is created...");
    }
    public static void main(String[] args){
      //  boolean flag=false;
        FileExample aa=new FileExample();
        aa.createdir();
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

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void createfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void createfolder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void createfoider() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void createfolder(String fname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
