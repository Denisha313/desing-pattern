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
public interface IVisitor {
 
    public void visit(Mango mango);
    public void visit(Apple apple);
}
