/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Terrain;

import Maps.CartesianMarsCoordinates;
import java.util.Hashtable;

/**
 *
 * @author Tobias
 */
public class Obstacles {

    /**
     * To store the obstacles, Hashtable instead of Hashmap because it is synchronized (in case you have multiple rovers on the same terrain
     */
    private Hashtable<CartesianMarsCoordinates,Boolean> Obstacles;
    
    public Obstacles(){
        this.Obstacles = new Hashtable<>();
    }
    

    
}
