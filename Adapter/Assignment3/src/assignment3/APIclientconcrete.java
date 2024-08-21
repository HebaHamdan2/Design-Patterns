/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author HebaHamdan
 */
public class APIclientconcrete implements APIclient{
    
     public void readJson(){
       System.out.println("Data from client with JSON format");
    }
    public String generateJson(){
    return "Generating JSON data from client";
    }
}
