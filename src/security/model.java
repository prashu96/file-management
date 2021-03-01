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
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class model extends JFrame
{
    public model()
    {
        
        File curDir = new File("d://stockFile/mydoc");
      //  getAllFiles(curDir);
    //}
    //public static void getAllFiles(File curDir) {

        File[] filesList = curDir.listFiles();
        
        for(File f : filesList){
            if(f.isDirectory()||f.isFile())
                System.out.println(f.getName());
                //System.out.println(f.getName());
        //headers for the table
        String[] columns = new String[] {
            "File Name"
        };
         
        Object[][] data = new Object[][] {
            
            { f.getName() }, 
       
        };
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
        
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.pack();
        this.setVisible(true);
    }
}
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new model();
            }
        });
    }    
}