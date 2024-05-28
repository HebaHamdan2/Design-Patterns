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
public class FillColor extends mainDecorater{
 Color color;
 Shape shape;
public enum Color{
 RED,
GREEN,
BLUE,
WHITE,
BLACK
}
public FillColor(Shape shape,Color color){
this.color=color;
this.shape=shape;
}
    @Override
    public String getDescription() {
    return shape.getDescription()+"\nfill-color: "+color;
    }

    @Override
    public void draw() {
    shape.draw();
        System.out.println("fill-color: "+color);
    }
   
}
 
    
