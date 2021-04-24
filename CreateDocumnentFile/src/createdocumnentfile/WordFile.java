/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createdocumnentfile;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author RSM
 */
public class WordFile implements DocumentFile {

    @Override
    public String openFile() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      try {
       if(Desktop.isDesktopSupported())
       {
           Desktop.getDesktop().open(new File("d:\\abc.docx"));
           
           System.out.println("open File Succusfully");
       }
      }
      catch (IOException ioe) {
        ioe.printStackTrace();
        } 
      BufferedReader in = null;
      List<String> name = new ArrayList<String>();
      
      try{
          in = new BufferedReader(new FileReader("d:\\abc.docx"));
          String nm;
          while((nm =in.readLine())!= null)
          {
              name.add(nm);
          }
      } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(WordFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WordFile.class.getName()).log(Level.SEVERE, null, ex);
        }  
      
      finally
      {
          if(in!=null)
          {
              try {
                  in.close();
              } catch (IOException ex) {
                  Logger.getLogger(WordFile.class.getName()).log(Level.SEVERE, null, ex);
              }
              
              
              
          }
      }
      for (String x:name)
          System.out.println("Your Word File is ::" +x);
        return "Opne File Succussfully...";
     
    }

    @Override
    public String closeFile() {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              return "Close File Succussfully...";
    }
     
    

    @Override
    public String saveFile() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             return "Save File Succussfully...";
       }
}
    

