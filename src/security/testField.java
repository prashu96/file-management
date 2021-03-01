/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

/**
 *
 * @author Prashanth.M
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
class testField {
    public static void main(String [] args)
    {
        try
        {
            String host="smtp.gmail.com";
            String user="prashanthm331@gmail.com";
            String pass="9901894160";
            String to="prashanthm331@gmail.com";
            String from="prashanthm331@gmail.com";
            String subject="OTP";
            String messageText="This is the otp";
            boolean sessiondebug=false;
            
            Properties props=System.getProperties();
            
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host",host);
            props.put("mail.smtp.port", "456");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession=Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessiondebug);
            InternetAddress[] address;
          //  address = new InternetAddress(to);
            Message msg=new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            // msg.setRecipients(Message.RecipientType.TO,new InternetAddress(to)); 
                     msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
            msg.setSubject(subject); 
            msg.setText(messageText);
            
            Transport transport=mailSession.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            if(true) {
                System.out.println("message sent");
                JOptionPane.showMessageDialog(null, "OTP sent successfully...");
    
            } 
            else {
                JOptionPane.showMessageDialog(null, "Unable to send OTP!!!,,,");
            }
            
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, "Unable to send OTP!!!,,,");
            System.out.println(ex);
        }
    }
      
    
}

 /*   static String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
*/