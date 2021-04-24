/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createdocumnentfile;
import java.util.Scanner;

/**
 *
 * @author RSM
 */
public class CreateDocumnentFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocumentFactory df;
        DocumentFile dfile;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Word File");
        System.out.println("2 Text File");
        System.out.println("3 excle File");
        System.out.println("4 pdf File");
         
        System.out.println("Enter Your Choice");
        
        int Choice = sc.nextInt();
        dfile= DocumentFactory.getDocumnentFile(Choice);
        System.out.println(dfile.openFile());
        System.out.println(dfile.saveFile());
        System.out.println(dfile.closeFile());
    }
    
}
