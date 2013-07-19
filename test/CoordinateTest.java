/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Maps.CartesianMarsCoordinates;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Tobias
 */
public class CoordinateTest {
    
    public CoordinateTest() {
        
    }
    
    /**Tests if you can add two sets of coordinates */
    @Test
    public void addition(){
        
    }
    
    /**Tests if you can substract two sets of coordinates */ 
    @Test
    public void substract(){
        
    }
    
    //**Tests comparison of two sets of coordinates */
    @Test
    public void equals(){
        //Test two equal coordinates
        CartesianMarsCoordinates c1 = new CartesianMarsCoordinates(100,100);
        CartesianMarsCoordinates c2 = new CartesianMarsCoordinates(100,100);
        assert c1.equals(c2) == true;
        
        //Test two unequal coordinates
        c1 = new CartesianMarsCoordinates(105,100);
        assert c1.equals(c2) != true;
        
    }

}
