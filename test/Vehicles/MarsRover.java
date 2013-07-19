/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicles;

import Maps.CartesianMarsCoordinates;
import java.util.LinkedList;

/**
 *
 * @author Tobias
 */
public class MarsRover {
    
    private CartesianMarsCoordinates position;
    

    /**
     * constructor of a mars rover
     * @param x x coordinate
     * @param y y coordinate
     */
    public MarsRover(int x, int y) {
        this.position = new CartesianMarsCoordinates(x,y);
        
    }
    
    /**
     * moves the rover x in x-direction and y in y-direction
     * @param x
     * @param y 
     */
    private void move(int x,int y){
        this.position.add(x, y);
    }
    
    public CartesianMarsCoordinates getPosition(){
        return(this.position);
    }
    
    /**
     * Moves the rover to a given position
     * @param p Position to teleport to
     */
    private void Teleport(CartesianMarsCoordinates p){
        this.position = p;
    }

    /**
     * Add some driving directions to the existing commandos
     * @param c commandos to add
     */
    public void commando(char[] c) {
        for(int i = 0; i<c.length;i++){
            this.move(c[i]);
        }
    }
    

    /**
     * overloads commando(char[] c)
     * @param f Commandos to add
     */
    public void commando(String f) {
        this.commando(f.toCharArray());
    }
    
    /**
     * Overloads Teleport(CartesianMarsCoordinates p)
     * @param x 
     * @param y 
     */
    public void Teleport(int x, int y){
        this.Teleport(new CartesianMarsCoordinates(x,y));
    }

    private void move(char c) {
        switch (c){
            case 'f':
                this.move(0,1);
                break;
            case 'b':
                 this.move(0,-1);
                 break;
            case 'l':
                 this.move(-1,0);
                 break;
            case 'r':
                 this.move(1,0);
                 break;
        }
            
                
    }
    
    
}
