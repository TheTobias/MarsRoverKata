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
    public static final int Width = 1000, Height = 1000;

    public CartesianMarsCoordinates(int x, int y) {
        if(x<0){
            //Modulo operator does not work for negative numbers.
            //Therefore we have to add 
            x-=Math.round(x/Width)*Width;
            x+=Width;
        }
        if(y<0){
            y-=Math.round(y/Height)*Height;
            y+=Height;
        }
        this.x = x%Width;
        this.y = y%Height;                
    }
    
     public boolean equals(CartesianMarsCoordinates c){
        return(this.x == c.x && this.y == c.y);
    }

    public void add(int x, int y) {
        this.x += x;
        this.y += y;
    }
    
    public int getx(){
        return(this.x);
    }
    
    public int gety(){
        return(this.y);
    }
    
}
