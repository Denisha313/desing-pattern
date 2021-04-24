/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo;

/**
 *
 * @author st
 */
public class ThreadDemo  extends Thread{
    private String praposal;
    
    public ThreadDemo(String Praposal)
    {
        praposal = Praposal;
    }
    
    public void run()
    {
        try{
        
            ThreadSingleton ts = ThreadSingleton.getInstance(praposal);
            ts.printPropasalName();
        }
        catch(Exception e)
        {
                System.out.println(e);
        }
    
    }
}
