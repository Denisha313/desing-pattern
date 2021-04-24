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
public class StringUpperCase extends SpecialString{
    
    public StringUpperCase(IString Bstring) {
        super(Bstring);
    }

    @Override
    public String Convert() {
        String ustr = str.Convert();
        return str.Convert()+ ustr.toUpperCase();
    }
    
}
