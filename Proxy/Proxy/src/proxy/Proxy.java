/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author st
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IInternet i = new ProxyInternet();
        try{
            i.connect("bknmu.edu.in");
            i.connect("bknmu.org");
            
          /*  i.connect("gujratuniversity.com");
            i.connect("gujaratuniversity.ac.in");
            
            i.connect("gujratvidyapith.com");
            i.connect("gujaratvidyapith.org");
            
            i.connect("google.in");
            i.connect("google.com");
            
          */  
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
