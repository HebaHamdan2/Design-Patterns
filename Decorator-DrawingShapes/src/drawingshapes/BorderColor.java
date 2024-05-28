/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingshapes;
 public class BorderColor extends mainDecorater {
     Color color;
        Shape shape;
public enum Color{
 RED,
GREEN,
BLUE,
WHITE,
BLACK
}
public BorderColor(Shape shape,Color color){
this.shape=shape;
this.color=color;
}
    @Override
    public String getDescription() {
        return shape.getDescription()+"\nborder-color: "+color;
    }

    @Override
    public void draw() {
    shape.draw();
    System.out.println("border-color: "+color);
    }


    }
  
  //    public BorderColor(String c,Shape shape ){
//        this.shape=shape;
//            switch (c.toLowerCase()) {
//                case "red":
//                    color=Color.RED;
//                    break;
//                case "green":
//                    color=Color.GREEN;
//                    break;
//                case "blue":
//                    color=Color.BLUE;
//                    break;
//                case "white":
//                    color=Color.WHITE;
//                    break;
//                default:
//                    color=Color.BLACK;
//                    break;
//            }
//    
//    }
