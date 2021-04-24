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
public class RealInternet implements IInternet {

    @Override
    public void connect(String server) {
        System.out.println("Connect To "+ server);
    }
    
}
