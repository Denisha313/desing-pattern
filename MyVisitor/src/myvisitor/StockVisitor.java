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
public class StockVisitor implements IVisitor {

    int stock;
    public  StockVisitor(int st) {
        super();
        this.stock = st;
    }
    @Override
    public void visit(Mango mango) {
        System.out.println("Mango Stock " + this.getStock());
    }

    @Override
    public void visit(Apple apple) {
        System.out.println("Apple Stock " + this.getStock());
    }

    private int getStock() {
        return stock;
    }
    
}
