/*
 * Name: Jaime Tavares
 * Student Number: 991512643
 * Program: Information Systems Engineering
 */
package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaime Tavares
 */
public class GoFishyPlayerTest {
    
    public GoFishyPlayerTest() {
    }

    /**
     * Test of play method, of class GoFishyPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        GoFishyPlayer instance = new GoFishyPlayer("Jay");
        //instance.play();
        assertEquals("Jay", instance.getName());
    }
    
}
