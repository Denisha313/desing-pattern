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
public class ThreadSingleton {

    private static ThreadSingleton instance;
    public static String Parposal;
    
    private ThreadSingleton()
    {
    
    }
    
    public static ThreadSingleton getInstance(String parposal)
    {
        synchronized(ThreadSingleton.class)
        {
            if(instance == null)
            {
                Parposal = parposal;
                instance = new ThreadSingleton();
                
            }
        
        }
        return instance;
    }
    
    public void printPropasalName()
    {
        System.out.println(Parposal  + " Parposal Create to Instance...");
    }
}
