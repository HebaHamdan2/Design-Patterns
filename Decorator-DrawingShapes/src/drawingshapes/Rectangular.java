/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingshapes;

/**
 *
 * @author Lenovo
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

