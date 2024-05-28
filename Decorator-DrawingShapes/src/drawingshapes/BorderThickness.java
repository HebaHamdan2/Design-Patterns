
package drawingshapes;

/**
 *
 * @author Heba Hamdan
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
