/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author user
 */
public class TestGroupOfCards {
    
    public TestGroupOfCards() {
    }
    
      /**
     * Test of fullDeck method, of class GroupOfCards.
     */
    
    @Test
    public void testFullDeckGood() {
        System.out.println("fullDeckGood");
        GroupOfCards instance = new GroupOfCards();
        instance.fullDeck();
        boolean expResult = true;
        boolean result = (instance.getCards().size()==52);
        assertEquals(expResult, result);

    }  // end of fullDeckGood
    
    @Test
    public void testFullDeckBad() {
        System.out.println("fullDeckBad");
        GroupOfCards instance = new GroupOfCards();
        instance.fullDeck();
        instance.getCards().remove(15);
        boolean expResult = false;
        boolean result = instance.getCards().size()==52;
        //if the method is not being running correctly
        assertEquals(expResult, result);

    }  //end of fullDeckBad
    
    @Test
    public void testFullDeckBoundry() {
        System.out.println("fullDeckBoundry");
        GroupOfCards instance = new GroupOfCards();
        instance.fullDeck();
        //System.out.println(instance.getCards().get(51).getValue());
        boolean expResult = true;
        boolean result = instance.getCards().get(51).getValue() == 13 && instance.getCards().get(51).getSuit() == 4;
        
        // result = result && (instance.getCards().indexOf(new PlayCard(4,13)) == 51);
        //the boundry is exectly 52 cards created
        assertEquals(expResult, result);

    }  //end of fullDeckBoundry
    

        /**$
         * Test of addCard method, of class GroupOfCards.
         */
        @Test
        public void testAddCardGood() {
            System.out.println("addCardGood");
            PlayCard card = new PlayCard(2,3);
            GroupOfCards instance = new GroupOfCards();
            instance.addCard(card);
           // System.out.println(instance.getCards().get(0).getValue() + "," +instance.getCards().get(0).getSuit());
            boolean expResult = true;
            boolean result = instance.getCards().get(0).getValue() == 2 && instance.getCards().get(0).getSuit() == 3;
            // the card is added into the arrayList
             assertEquals(expResult, result);
        } //end of addCardGood

        @Test
        public void testAddCardBad() {
            System.out.println("addCardBad");
            PlayCard card = null;
            GroupOfCards instance = new GroupOfCards();
            instance.addCard(card);
            //System.out.println(instance.getCards().size());
            boolean expResult = false;
            //invalid card can not be added;
            boolean result = instance.getCards().size()==1;
            // empty card can not be added into the arrayList
             assertEquals(expResult, result);
        } //end of addCardBad

        @Test
        public void testAddCardBoundry() {
            System.out.println("addCardBoundry");
            PlayCard card = new PlayCard(1,1);
            GroupOfCards instance = new GroupOfCards();
            //the minimum card can be added
            instance.addCard(card);
            boolean expResult = true;
            boolean result = instance.getCards().get(0).getValue() == 1 && instance.getCards().get(0).getSuit() == 1;
            assertEquals(expResult, result);
        } //end of addCardBoundry

        /**
         * Test of deleteValue method, of class GroupOfCards.
         */
        @Test
        public void testDeleteValueGood() {
            System.out.println("deleteValueGood");
            int value = 3;
            PlayCard card = new PlayCard(value,1);
            GroupOfCards instance = new GroupOfCards();
            instance.addCard(card);
            instance.addCard(new PlayCard(5,4));
            PlayCard expResult =  card;
            PlayCard result = instance.deleteValue(value);
            assertEquals(expResult, result);

        }//end of deleteValueGood

        @Test
        public void testDeleteValueBad() {
            System.out.println("deleteValueBad");
            int value = 14;
            PlayCard expResult = null;
            GroupOfCards instance = new GroupOfCards();
            instance.addCard(new PlayCard(3,4));
            PlayCard result = instance.deleteValue(value);
            assertEquals(expResult, result);

        }//end of deleteValueBad

        @Test
        public void testDeleteValueBoundry() {
            System.out.println("deleteValueBoundry");
            int value = 13;
            PlayCard card = new PlayCard(13,4);
            GroupOfCards instance = new GroupOfCards();
            instance.addCard(card);
            PlayCard expResult =  card;
            PlayCard result = instance.deleteValue(value);
            assertEquals(expResult, result);

        }//end of deleteValueBoundry


    
    
    /**
     * Test of deleteACard method, of class GroupOfCards.
     */
    @Test
    public void testDeleteACardGood() {
        System.out.println("deleteACardGood");
        GroupOfCards instance = new GroupOfCards();
        instance.fullDeck();
        PlayCard card = instance.deleteACard();
        int expResult = -1;
        int result = instance.getCards().indexOf(card);
        assertEquals(expResult, result);
    
    } //end of testDeleteACardGood
    
    @Test
    public void testDeleteACardBad() {
        System.out.println("deleteACardBad");
        GroupOfCards instance = new GroupOfCards();
        PlayCard expResult = null;
        PlayCard result = instance.deleteACard();
        assertEquals(expResult, result);
    
    } //end of testDeleteACardBad
    
    @Test
    public void testDeleteACardBoundry() {
        System.out.println("deleteACardBoundry");
        GroupOfCards instance = new GroupOfCards();
        PlayCard card = new PlayCard(3,4);
        instance.addCard(card);
        PlayCard expResult = instance.getCards().get(instance.getSize()-1);
        PlayCard result = instance.deleteACard();
        assertEquals(expResult, result);
    
    } //end of testDeleteACardBoundry
    
    
    
    

    /**
     * Test of checkBookStartingDeal method, of class GroupOfCards.
     */
//    @Test
//    public void testCheckBookStartingDeal() {
//        System.out.println("checkBookStartingDeal");
//        GroupOfCards instance = new GroupOfCards();
//        int expResult = 0;
//        int result = instance.checkBookStartingDeal();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of getCount method, of class GroupOfCards.
//     */
//    @Test
//    public void testGetCount() {
//        System.out.println("getCount");
//        int value = 0;
//        GroupOfCards instance = new GroupOfCards();
//        int expResult = 0;
//        int result = instance.getCount(value);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of showCard method, of class GroupOfCards.
//     */
//    @Test
//    public void testShowCard() {
//        System.out.println("showCard");
//        int value = 0;
//        GroupOfCards instance = new GroupOfCards();
//        PlayCard expResult = null;
//        PlayCard result = instance.showCard(value);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCards method, of class GroupOfCards.
//     */
//    @Test
//    public void testGetCards() {
//        System.out.println("getCards");
//        GroupOfCards instance = new GroupOfCards();
//        ArrayList<PlayCard> expResult = null;
//        ArrayList<PlayCard> result = instance.getCards();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of shuffle method, of class GroupOfCards.
//     */
//    @Test
//    public void testShuffle() {
//        System.out.println("shuffle");
//        GroupOfCards instance = new GroupOfCards();
//        instance.shuffle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSize method, of class GroupOfCards.
//     */
//    @Test
//    public void testGetSize() {
//        System.out.println("getSize");
//        GroupOfCards instance = new GroupOfCards();
//        int expResult = 0;
//        int result = instance.getSize();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSize method, of class GroupOfCards.
//     */
//    @Test
//    public void testSetSize() {
//        System.out.println("setSize");
//        int size = 0;
//        GroupOfCards instance = new GroupOfCards();
//        instance.setSize(size);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class GroupOfCards.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        GroupOfCards instance = new GroupOfCards();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
