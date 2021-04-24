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
public abstract class SpecialString implements IString{

    
    protected IString str;
    
    public SpecialString(IString Bstring)
    {
        this.str = Bstring;
    }
   /* public String Convert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    
}
