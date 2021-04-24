/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydemo;

/**
 *
 * @author RSM
 */
public abstract class AbstractBillFactory {
    public abstract IWaterBill getWaterbill();
    public abstract IElectricityBill getElectricitybill();
    
    public static AbstractBillFactory getFactory(int i)
    {
        if(i == 1)
        {
            return new RajkotBillFactory();
        }
        else if (i== 2)
        {
            return new AmdBillFactory();
        }
        else 
        {
            return null;
        }
        
    }
}
