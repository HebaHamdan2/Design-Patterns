package drawingshapes;

/**
 *
 * @author HebaHamdan
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
 
    
