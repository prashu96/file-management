/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;
import java.util.*;
/**
 *
 * @author Prashanth.M
 */
public class createotp {
     static char[] sendotp(int length){
        System.out.println("your otp is:");
        String number="0123456789abcdefghijklmnopqrstuvwyz";
        Random r=new Random();
        char[] otp=new char[length];
        for(int i=0;i<length;i++){
            otp[i]=number.charAt(r.nextInt(number.length()));
        }
        
        return otp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Generating otp....!!");
        char otp[]=sendotp(4);
         System.out.println(otp);
        // TODO code application logic here
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
