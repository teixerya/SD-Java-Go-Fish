/*
 * Name: Jaime Tavares
 * Student Number: 991512643
 * Program: Information Systems Engineering
 */
package ca.sheridancollege.project;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jaime Tavares
 */
public class GoFishyGameTest {
    
    public GoFishyGameTest() {
    }

    /**
     * Test of play method, of class GoFishyGame. Ensure instance can be created
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        GoFishyGame instance = new GoFishyGame();
        //instance.play();
        assertEquals(false, instance.win);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of playGoFishy method, of class GoFishyGame.
     */
//    @Test
//    public void testPlayGoFishy() {
//        System.out.println("playGoFishy");
//        GoFishyGame instance = new GoFishyGame();
//        instance.playGoFishy();
//        assertEquals(false, instance.win);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of initializeStartingHands method, of class GoFishyGame.
     */
    @Test
    public void testInitializeStartingHands() {
        System.out.println("initializeStartingHands");
        GoFishyGame instance = new GoFishyGame();
        instance.initializeStartingHands();
        assertEquals(false, instance.win);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkStartingDeal method, of class GoFishyGame.
     */
    @Test
    public void testCheckStartingDeal() {
        System.out.println("checkStartingDeal");
        GoFishyGame instance = new GoFishyGame();
        //instance.checkStartingDeal();
        assertEquals(instance.win, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of playerTurn method, of class GoFishyGame.
     */
//    @Test
//    public void testPlayerTurn() {
//        System.out.println("playerTurn");
//        GoFishyGame instance = new GoFishyGame();
//        //instance.playerTurn();
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of compTurn method, of class GoFishyGame.
     */
//    @Test
//    public void testCompTurn() {
//        System.out.println("compTurn");
//        GoFishyGame instance = new GoFishyGame();
//        instance.compTurn();
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of checkForGameOver method, of class GoFishyGame.
     */
    @Test
    public void testCheckForGameOver() {
        System.out.println("checkForGameOver");
        GoFishyGame instance = new GoFishyGame();
        instance.checkForGameOver();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class GoFishyGame.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        GoFishyGame instance = new GoFishyGame();
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of displayDeck method, of class GoFishyGame.
     */
    @Test
    public void testDisplayDeck() {
        System.out.println("displayDeck");
        GroupOfCards gc = new GroupOfCards();
        GoFishyGame instance = new GoFishyGame();
        String expResult = "Empty Hand";
        String result = instance.displayDeck(gc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class GoFishyGame.
     */
//    @Test
//    public void testPause() {
//        System.out.println("pause");
//        GoFishyGame instance = new GoFishyGame();
//         instance.pause();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
