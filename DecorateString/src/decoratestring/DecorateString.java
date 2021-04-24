/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratestring;

/**
 *
 * @author RSM
 */
public class DecorateString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IString mystr = new SimpleString();
        System.out.println("*** Simple String ***");
        System.out.println(mystr.Convert());
       
        IString yourstr = new StringUpperCase(mystr);
        System.out.println("*** UPPERCASE ***");
        System.out.println(yourstr.Convert());
        
        IString lstr = new StringLowerCase(mystr);
        System.out.println("*** LOWERCASE ***");
        System.out.println(lstr.Convert());
        
        IString rstr = new StringReverse(mystr);
        System.out.println("*** REVERSE ***");
        System.out.println(rstr.Convert());
    }
    
}
