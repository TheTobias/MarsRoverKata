/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicles;

import Maps.CartesianMarsCoordinates;
import Terrain.Obstacles;

/**
 *
 * @author Tobias
 */
public class MarsRover {
    
    private CartesianMarsCoordinates position;
    private Obstacles obstacles;
    

    /**
     * constructor of a mars rover
     * @param x x coordinate
     * @param y y coordinate
     */
    public MarsRover(int x, int y) {
       this.position = new CartesianMarsCoordinates(x,y);
       this.obstacles = new Obstacles(); 
       
       
    }

    /**
     * New constructor that allows for obstacles
     * @param x
     * @param y
     * @param obstacles
     * @throws SpawnOnObstacleException 
     */
    public MarsRover(int x, int y, Obstacles obstacles) throws SpawnOnObstacleException{
        this(x,y);
        this.obstacles = obstacles;
        if(obstacles.check(x, y)){
            throw new SpawnOnObstacleException();
        }
    }
    
    /**
     * moves the rover x in x-direction and y in y-direction
     * @param x
     * @param y
     * @throws ObstacleException 
     */
    private void move(int x,int y) throws ObstacleException{
        if(this.obstacles.check(this.position.add(x, y))){
            this.position.add(-x,-y);
            throw new ObstacleException();
        }
    }
    
    public CartesianMarsCoordinates getPosition(){
        return(this.position);
    }
    
    /**
     * Moves the rover to a given position
     * @param p Position to teleport to
     */
    private void Teleport(CartesianMarsCoordinates p) throws ObstacleException{
        if(this.obstacles.check(p)){
            throw new ObstacleException();
        }
        this.position = p;
    }

    /**
     * Add some driving directions to the existing commandos
     * @param c commandos to add
     */
    public void commando(char[] c) throws ObstacleException {
        for(int i = 0; i<c.length;i++){
            this.move(c[i]);
        }
    }
    

    /**
     * overloads commando(char[] c)
     * @param f Commandos to add
     */
    public void commando(String f) throws ObstacleException {
        this.commando(f.toCharArray());
    }
    
    /**
     * Overloads Teleport(CartesianMarsCoordinates p)
     * @param x 
     * @param y 
     */
    public void Teleport(int x, int y) throws ObstacleException{
        this.Teleport(new CartesianMarsCoordinates(x,y));
    }

    /**
     * Translates a char into a movement
     * @param c
     * @throws ObstacleException 
     */
    private void move(char c) throws ObstacleException {
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

    /**
     * 
     * @return the set of obstacles
     */
    public Obstacles getObstacles() {
        return(this.obstacles);
    }
    
    
}
