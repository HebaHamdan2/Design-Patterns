
package drawingshapes;

/**
 *
 * @author HebaHamdan
 */
public class Rectangular implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangular");
    }

    @Override
    public String getDescription() {
    return "Rectangular";
    }
}

