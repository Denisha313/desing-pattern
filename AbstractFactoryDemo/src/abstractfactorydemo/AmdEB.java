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
public class AmdEB implements IElectricityBill{

    double Amt;
    @Override
    public double getBillAmount() {
        return Amt;
    }

    @Override
    public void setBillAmount(int unit) {
        this.Amt= unit*6;
    }
    
}
