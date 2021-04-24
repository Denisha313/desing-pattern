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
public class SingletonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread t1 = new ThreadDemo("Thread1");
        Thread t2 = new ThreadDemo("Thread2");
        Thread t3 = new ThreadDemo("Thread3");
        Thread t4 = new ThreadDemo("Thread4");
        
        t1.run();
        t2.run();
        t3.run();
        t4.run();
    }
    
}
