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
public class JSONadapter implements APIclient{
    APIserver xml;

    public JSONadapter(APIserver xml) {
        this.xml = xml;
    }
    @Override
    public void readJson(){
    xml.readXML();
    }
    @Override
    public String generateJson(){
    return xml.generateXML();
    }
}
