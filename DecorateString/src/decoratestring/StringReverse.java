/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratestring;

import java.lang.*;
/**
 *
 * @author RSM
 */
public class StringReverse extends SpecialString{

    public StringReverse(IString Bstring) {
        super(Bstring);
    }

    @Override
    public String Convert() {
    
        String rstr = str.Convert();
        StringBuffer sbr = new StringBuffer(rstr);
        
        return  str.Convert() + sbr.reverse();
    
    }
    
}
