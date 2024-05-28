package factoryassignment;

/**
 *
 * @author HebaHamdan
 */
public class FactoryAssignment {

    public static void main(String[] args) {
       ButtonDesign b=new ButtonDesign(new simpleButtonFactory());
       b.drawButton("rounded");
    }
    
}
