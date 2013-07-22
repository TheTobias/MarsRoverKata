/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Maps.CartesianMarsCoordinates;
import Vehicles.MarsRover;
import Vehicles.ObstacleException;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Tobias
 */
public class RoverTest {
    
    public RoverTest() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
   
        MarsRover rover = new MarsRover(100,100);
        CartesianMarsCoordinates target;

       @Test
       public void Forward() throws ObstacleException{
           rover.Teleport(100,100);
           rover.commando("f");
           target = new CartesianMarsCoordinates(100,101);
           Assert.assertTrue(rover.getPosition().equals(target));
       }

       @Test
       public void Backward() throws ObstacleException{
           rover.Teleport(100,100);
           rover.commando("b");
           target = new CartesianMarsCoordinates(100,99);
           Assert.assertTrue(rover.getPosition().equals(target));
       }
       
       @Test
       public void Left() throws ObstacleException{
           rover.Teleport(100,100);
           rover.commando("lf");
           target = new CartesianMarsCoordinates(99,100);
           Assert.assertTrue(rover.getPosition().equals(target));
       }
       
       @Test
       public void Right() throws ObstacleException{
           rover.Teleport(100,100);
           rover.commando("rf");
           target = new CartesianMarsCoordinates(101,100);
           Assert.assertTrue(rover.getPosition().equals(target));
       }
    
       @Test
       public void Sequence() throws ObstacleException{
           rover.Teleport(50,50);
           rover.commando("fflff");
           target = new CartesianMarsCoordinates(48,52);
           Assert.assertTrue(rover.getPosition().equals(target));
           
           rover.Teleport(CartesianMarsCoordinates.Width-1,0);
           rover.commando("rfffflbbbb");
           target = new CartesianMarsCoordinates(3,CartesianMarsCoordinates.Height-4);
           Assert.assertTrue(rover.getPosition().equals(target));
       }
       
       
       @Test
       public void directions() throws ObstacleException{
           MarsRover.direction d = MarsRover.direction.DOWN;
           Assert.assertEquals(d.turnLeft().turnLeft(), d.turnRight().turnRight());
           d = MarsRover.direction.LEFT;
           Assert.assertEquals(d.turnLeft().turnLeft(), d.turnRight().turnRight());
           d = MarsRover.direction.RIGHT;
           Assert.assertEquals(d.turnLeft().turnLeft(), d.turnRight().turnRight());
           d = MarsRover.direction.UP;
           Assert.assertEquals(d.turnLeft().turnLeft(), d.turnRight().turnRight());
           d = MarsRover.direction.LEFT;
           Assert.assertTrue(d.getX() == -1);
           rover = new MarsRover(99,99);
           Assert.assertTrue(rover.getDirection() == MarsRover.direction.UP);
           rover.commando("r");
           Assert.assertTrue(rover.getDirection() == MarsRover.direction.RIGHT);
       }
               
               
}
