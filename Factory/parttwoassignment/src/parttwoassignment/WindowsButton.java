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
public class WindowsButton extends ButtonDesign{

    @Override
    public Button createDesign(String type) {
    Button button =null;
    if(type.equals("square")){
    button=new WindowsButtonSquare();
    }else if(type.equals("rounded")){
    button=new WindowsButtonRounded();
    }
    return button;
    
    }
    
}
