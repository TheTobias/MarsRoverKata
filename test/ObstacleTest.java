/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

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
    Obstacles.add(200,200);
    
    
    @Test
    public void check(){
        assert Obstacles.check(200,200) == true;
        assert Obstacles.check(0,0) == false;
    }
            
 
}
