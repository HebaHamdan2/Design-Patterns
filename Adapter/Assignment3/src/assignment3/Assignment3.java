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
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        APIserver xml=new APIserverconcrete();
        APIclient client=new JSONadapter(xml);
        client.readJson();
        APIclient json=new APIclientconcrete();
        APIserver server=new XMLadapter(json);
        server.readXML();
    }
    
}
