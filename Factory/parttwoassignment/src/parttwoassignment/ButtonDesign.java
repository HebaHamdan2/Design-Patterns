/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parttwoassignment;

/**
 *
 * @author HebaHamdan
 */
public abstract class ButtonDesign {
    public Button drawButton(String type){
    Button button=createDesign(type);
    button.draw();
    return button;
    }
   public abstract Button createDesign(String type);
}
