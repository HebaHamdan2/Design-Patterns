
package drawingshapes;

/**
 *
 * @author HebaHamdan
 */
public class BorderStyle extends mainDecorater {
    Shape shape;
    borderStyle bStyle;
 public enum borderStyle {
DASHED,
SOLID,
DOTTED,
WHITE,
BLACK
    }
    public BorderStyle(Shape shape,borderStyle bStyle){
    this.shape=shape;
    this.bStyle=bStyle;
    }
    @Override
    public String getDescription() {
    return shape.getDescription()+"\nborder-style: "+bStyle;
    }

    @Override
    public void draw() {
    shape.draw();
    System.out.println("border-style: "+bStyle);
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setbStyle(borderStyle bStyle) {
        this.bStyle = bStyle;
    }
   
}
//public BorderStyle(Shape shape,String bStyle){
//this.shape=shape;
//switch (bStyle.toUpperCase()) {
//                case "DASHED":
//                   bStyle=borderStyle.DASHED;
//                    break;
//                case "SOLID":
//                    bStyle=borderStyle.SOLID;
//                    break;
//                case "DOTTED":
//                    bStyle=borderStyle.DOTTED;
//                    break;
//                case "BLACK":
//                   bStyle=borderStyle.BLACK;
//                    break;
//                default:
//                    bStyle=borderStyle.WHITE;
//                    break;
//            }
//}