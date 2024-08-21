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
public class XMLadapter implements APIserver {
    APIclient json;

    public XMLadapter(APIclient json) {
        this.json = json;
    }
    @Override
    public void readXML(){
    json.readJson();
    }
    @Override
    public String generateXML(){
    return json.generateJson();
    }
}
