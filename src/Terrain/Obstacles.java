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
     * Each obstacle is stored as an entry in the Hashtable with the string representation of the coordinates as the key
     */
    private Hashtable<String,Boolean> Obstacles;
    
    public Obstacles(){
        this.Obstacles = new Hashtable<>();
    }

    /**
     * Adds an obstacle at the given coordinates
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public void add(int x, int y) {
        this.add(new CartesianMarsCoordinates(x,y));
    }
    
    /**
     * Adds an obstacle at the given coordinates
     * @param c coordinates
     */
    public void add(CartesianMarsCoordinates c){
        this.Obstacles.put(c.toString(), true);
    }

    /**
     * check for obstacles
     * @param x
     * @param y
     * @return true if there is an obstacle, false if not
     */
    public boolean check(int x, int y) {
        return(this.check(new CartesianMarsCoordinates(x,y)));
    }

    /**
     * check for obstacles
     * @param c coordinates
     * @return true if there is an obstacle, false if not
     */
    public boolean check(CartesianMarsCoordinates c) {
        return(this.Obstacles.containsKey(c.toString()));
    }
    

    
}
