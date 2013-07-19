/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Maps.CartesianMarsCoordinates;
import Vehicles.MarsRover;
import Vehicles.ObstacleException;
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
           assert rover.getPosition().equals(target);
       }

       @Test
       public void Backward() throws ObstacleException{
           rover.Teleport(100,100);
           rover.commando("b");
           target = new CartesianMarsCoordinates(100,99);
           assert rover.getPosition().equals(target);
       }
       
       @Test
       public void Left() throws ObstacleException{
           rover.Teleport(100,100);
           rover.commando("l");
           target = new CartesianMarsCoordinates(99,100);
           assert rover.getPosition().equals(target);
       }
       
       @Test
       public void Right() throws ObstacleException{
           rover.Teleport(100,100);
           rover.commando("r");
           target = new CartesianMarsCoordinates(101,100);
           System.out.println(rover.getPosition());
           assert rover.getPosition().equals(target);
       }
    
       @Test
       public void Sequence() throws ObstacleException{
           rover.Teleport(50,50);
           rover.commando("ffll");
           target = new CartesianMarsCoordinates(48,52);
           assert rover.getPosition().equals(target);
           
           rover.Teleport(CartesianMarsCoordinates.Width-1,0);
           rover.commando("rrrrbbbb");
           target = new CartesianMarsCoordinates(3,CartesianMarsCoordinates.Height-4);
           assert rover.getPosition().equals(target);
       }
}
