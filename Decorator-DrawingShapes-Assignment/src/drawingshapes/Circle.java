
package drawingshapes;

/**
 *
 * @author HebaHamdan
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public String getDescription() {
    return "Circle";
    }
    
}
