/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observercode;

public interface Observer {
	public void update(float temp, float humidity, float pressure);

       public void update();
}
