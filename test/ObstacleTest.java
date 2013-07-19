/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Vehicles.SpawnOnObstacleException;
import Terrain.Obstacles;
import Vehicles.MarsRover;
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
    
    @Test
    public void TestObstacleIntegration(){
        //if no set of obstacles is specified, there are no obstacles
        rover = new MarsRover(100,100);
        assert rover.getObstacles().check(200,200) == false;
        

        rover = new MarsRover(100,100,obstacles);
        assert rover.getObstacles().check(200,200) == true;
        
    }
           
    
    @Test
    public void TestRoverSpawnOnObstacle(){
        try{
            rover = new MarsRover(200,200,obstacles);
        }
        catch(SpawnOnObstacleException e){
            
        }
        
    }
            
 
}
