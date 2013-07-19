package Maps;

import java.lang.Math;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tobias
 */
public class CartesianMarsCoordinates {
    
    //** x and y coordinates
    protected int x,y;
    
    /**Height and Width of the Planet Mars, coordinates will be wrapped if they are outside of [0,width-1] respectively [0,height-1] */
    public static final int Width = 1000, Height = 5000;

    /**
     * Constructs new set of Coordinates
     * @param x
     * @param y 
     * Coordinates will be wrapped so that y is in [0,Height-1] x is in [0,Width-1]
     */
    public CartesianMarsCoordinates(int x, int y) {
        this.x = wrap(x,Width);
        this.y = wrap(y,Height);             
    }
    
    public boolean equals(CartesianMarsCoordinates c){
        return(this.x == c.x && this.y == c.y);
    }

    /**
     * Add x and y to coordinates
     * @param x 
     * @param y 
     */
    public CartesianMarsCoordinates add(int x, int y) {
        this.x = wrap(this.x+x,Width);
        this.y = wrap(this.y+y,Height);
        return(this.clone());
    }
    
    @Override
    public CartesianMarsCoordinates clone(){
        return(new CartesianMarsCoordinates(this.x,this.y));
    }
    
    public int getx(){
        return(this.x);
    }
    
    public int gety(){
        return(this.y);
    }
    
    /**
     * Planet is round remember?
     * @param coordinate coordinate to be wrapped around (in the range [0,max-1]
     * @param max 
     * @return wrapped coordinate
     */
    private static int wrap(int coordinate, int max){
        while(coordinate<0){
            coordinate+=max;
        }
        return(coordinate % max);
    }
    
    /**
     * 
     * @return String representation of the Coordinates
     */
    @Override
    public String toString(){
        return(String.valueOf(x)+"#"+String.valueOf(y));
    }
            
    
}
