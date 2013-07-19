/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Maps.CartesianMarsCoordinates;
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
        CartesianMarsCoordinates c1 = new CartesianMarsCoordinates (100,100);
        CartesianMarsCoordinates c2 = new CartesianMarsCoordinates (0,0);
        c2.add(100,100);
        assert c2.equals(c1);        
    }
    
    /**Tests if you can subtract two sets of coordinates */ 
    @Test
    public void substract(){
        CartesianMarsCoordinates c1 = new CartesianMarsCoordinates (100,100);
        CartesianMarsCoordinates c2 = new CartesianMarsCoordinates (0,0);
        c1.add(-100,-100);
        System.out.println(c1.getx());
        System.out.println(c1.gety());
        assert c1.equals(c2);
        
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
    
    //**Test if coordinates wrap correctly (Planets are round) */
    @Test
    public void wraparound(){
        //
        int x_offset = 5*CartesianMarsCoordinates.Width;
        int y_offset = 4*CartesianMarsCoordinates.Height;
        CartesianMarsCoordinates c1 = new CartesianMarsCoordinates(10+x_offset,10+y_offset);
        assert c1.getx() == 10;
        assert c1.gety() == 10;
        c1 = new CartesianMarsCoordinates(10-x_offset,10-y_offset);
        assert c1.getx() == 10;
        assert c1.gety() == 10;   
    }

}
