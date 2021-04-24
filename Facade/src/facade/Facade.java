/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author RSM
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reception r = new Reception();
        System.out.println("1: " + r.getMedical());
        System.out.println("2: " + r.getLaboratory());
        System.out.println("3: " + r.getxray());
        System.out.println("4: " + r.getOPD());
    }
    
}
