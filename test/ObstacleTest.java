/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Terrain.Obstacles;
import Vehicles.MarsRover;
import Vehicles.ObstacleException;
import Vehicles.SpawnOnObstacleException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author Tobias
 */
public class ObstacleTest {
    
    public ObstacleTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    static Obstacles obstacles = new Obstacles();
    static MarsRover rover;
    
    
    @Test
    public void TestObstacleClassBasics(){
        obstacles.add(200,200);
        assert obstacles.check(200,200) == true;
        assert obstacles.check(0,0) == false;
    }
    
//    /**
//     * Tests integration of the new Obstacle class in the Rover class
//     */
//    @Test
//    public void TestObstacleIntegration() throws SpawnOnObstacleException{
//        //if no set of obstacles is specified, there are no obstacles
//        rover = new MarsRover(100,100);
//        assert rover.getObstacles().check(200,200) == false;
//        
//        
//            rover = new MarsRover(100,100,obstacles);
//        
//        assert rover.getObstacles().check(200,200) == true;
//        
//    }
//           
    
    
    /**
     * Tests if an Exception is raised when the Rover is spawned on an obstacle
     */
    @Test
    public void TestRoverSpawnOnObstacle(){
        boolean b = false;
        try{
            rover = new MarsRover(200,200,obstacles);
        }
        catch(SpawnOnObstacleException e){
            b = true;
        }
        assert b;
        
    }
    
    @Test
    public void TestRoverStaysInPlace() throws SpawnOnObstacleException{
        rover = new MarsRover(199,200,obstacles);
        try {
            rover.commando("r");
        } catch (ObstacleException ex) {
            Logger.getLogger("Rover hit obstacle");
        }
        System.out.println(rover.getPosition());
        assert rover.getPosition().getx() == 199;
        
    }
    
    
    @Test
    public void TestRoverStops() throws SpawnOnObstacleException{
        rover = new MarsRover(190,190,obstacles);
        try {
            rover.commando("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr");
        } catch (ObstacleException ex) {
            Logger.getLogger("Rover hit obstacle at" + rover.getPosition().toString());
        }
        System.out.println(rover.getPosition());
        assert rover.getPosition().getx() == 200;
        assert rover.getPosition().gety() == 199;
        
    }
    
            
 
}
