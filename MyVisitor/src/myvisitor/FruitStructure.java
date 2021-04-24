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
public class FruitStructure {
    
   
   
   
    public static void applyVisitor()
    {
        DiscountVisitor dv = new DiscountVisitor(5);
       // Mango mango = new Mango("abc");
       System.out.println(dv.getDiscount());
        Mango mango = null;
        dv.visit(mango);
        Apple apple = null;
        dv.visit(apple);
        
        StockVisitor sv = new StockVisitor(150);
        
        sv.visit(mango);
        
        
        sv.visit(apple);
    }
 }

