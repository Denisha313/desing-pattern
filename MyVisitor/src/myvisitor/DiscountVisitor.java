/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myvisitor;

/**
 *
 * @author RSM
 */
public class DiscountVisitor implements IVisitor {

    private int discount;
    
    //@Override
    public  DiscountVisitor(int discount) {
        super();
        this.discount = discount;
    }

    public int getDiscount()
    {
        return discount;
    }
    @Override
    public void visit(Apple apple) {
        //System.out.println("Apple Fruit discount is 6% ");
        System.out.println("Apple Discount " + this.getDiscount() +"%  " );
    }

    /**
     *
     * @param mango
     */
    @Override
    public void visit(Mango mango) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Mango m = (Mango) mango;
        //m.setColor("Red");
        System.out.println("Mango Discount " + this.getDiscount() +"%  " );
        
    }
    
}
