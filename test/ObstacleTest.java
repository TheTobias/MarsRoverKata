/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
        rover = new MarsRover(100,100,obstacles);
    }
           
    
    @Test
    public void TestRoverSpawnOnObstacle(){
        rover = new MarsRover(200,200,obstacles);
    }
            
 
}
