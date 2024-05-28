/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingshapes;

/**
 *
 * @author Lenovo
 */
public class BorderThickness extends mainDecorater {
    Shape shape;
    double thick;
    public BorderThickness(Shape shape,double thick){
        this.shape=shape;
        this.thick=thick;
    }

    @Override
    public String getDescription() { 
        return shape.getDescription()+"\nborder-thickness: "+thick;
    }

    public void draw() {
    shape.draw();
        System.out.println("border-thickness: "+thick);
    }
}
