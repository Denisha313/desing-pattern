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

import java.util.Scanner;
public class AbstractFactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int choice1,choice2 ;
       
       Scanner in = new Scanner(System.in);
       System.out.println("1.WaterBill");
       System.out.println("2.ElectricityBill");
       
       System.out.println("Enter Your Choice [1 Or 2]:: ");
       choice1 = in.nextInt();
       
       System.out.println("1.Rajkot");
       System.out.println("2.Ahmedabad");
       
       System.out.println("Enter Your Choice [1 Or 2]:: ");
       choice2 = in.nextInt();
       
       AbstractBillFactory abf = AbstractBillFactory.getFactory(choice2);
       
       if(choice1 == 1)
       {
           IWaterBill iw = abf.getWaterbill();
           System.out.println("Enter your Unit ::- ");
           int unit = in.nextInt();
           iw.setBillAmount(unit);
           System.out.println("Enter your Unit ::- "+ iw.getBillAmount());
       
       }
       else
       {
           IElectricityBill ie = abf.getElectricitybill();
           System.out.println("Enter your Unit ::- ");
           int unit = in.nextInt();
           ie.setBillAmount(unit);
           System.out.println("Enter your Unit ::- "+ ie.getBillAmount());
       
       
       }
       
    }
    
}
