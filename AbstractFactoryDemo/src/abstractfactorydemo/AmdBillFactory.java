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
public class AmdBillFactory extends AbstractBillFactory {

    @Override
    public IWaterBill getWaterbill() {
        return new AmdWB();
    }

    @Override
    public IElectricityBill getElectricitybill() {
       return new AmdEB();
    }
    
}
