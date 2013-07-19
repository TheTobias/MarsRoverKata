/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Maps.CartesianMarsCoordinates;
import Vehicles.MarsRover;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

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
       public void Forward(){
           rover.Teleport(100,100);
           rover.commando("f");
           target = new CartesianMarsCoordinates(100,101);
           assert rover.getPosition().equals(target);
       }

       @Test
       public void Backward(){
           rover.Teleport(100,100);
           rover.commando("b");
           target = new CartesianMarsCoordinates(100,99);
           assert rover.getPosition().equals(target);
       }
       
       @Test
       public void Left(){
           rover.Teleport(100,100);
           rover.commando("l");
           target = new CartesianMarsCoordinates(99,100);
           assert rover.getPosition().equals(target);
       }
       
       @Test
       public void Right(){
           rover.Teleport(100,100);
           rover.commando("r");
           target = new CartesianMarsCoordinates(101,100);
           assert rover.getPosition().equals(target);
       }
    
       @Test
       public void Sequence(){
           rover.Teleport(50,50);
           rover.commando("ffll");
           target = new CartesianMarsCoordinates(98,102);
           assert rover.getPosition().equals(target);
       }
}
