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
public class Xray implements IHospital {

    String Dept;
    @Override
    public String setDepartment() { 
        Dept = "X-Ray Department";
        return Dept;
    }
    
}
