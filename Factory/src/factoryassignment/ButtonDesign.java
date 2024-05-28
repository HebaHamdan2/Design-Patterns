
package factoryassignment;

/**
 *
 * @author HebaHamdan
 */
public class ButtonDesign {
   simpleButtonFactory factory;
   public ButtonDesign(simpleButtonFactory factory){
   this.factory=factory;
   }
  public Button drawButton(String type){
  Button b=factory.createDesign(type);
  b.draw();
  return b;
  }
  
   
   
}
