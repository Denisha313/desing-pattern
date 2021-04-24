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
class Apple implements IFruit {

    private String type;
    private String color;
    
    public Apple(String type)
    {
        this.type = type;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    @Override
    public void accept(IVisitor iv) {
        iv.visit(this);
    }
    
}
