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
public class StringLowerCase  extends SpecialString{

    public StringLowerCase(IString Bstring) {
        super(Bstring);
    }

    @Override
    public String Convert() {

         String lstr = str.Convert();
        return str.Convert()+ lstr.toLowerCase();
    }
    
}
