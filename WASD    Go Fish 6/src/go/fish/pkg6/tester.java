package ca.sheridancollege.project;
/**
 * This class tests the GroupOfCards and PlayCard classes, ensuring they work 
 * well as both super and subclasses.
 *
 * @author Yan Z.
 * @author Ryan T.
 * @author Ninxin G.
 * @author Jaime T.
 * Date: 04/11/2021
 */
public class tester {
    
    public static void main(String[] args) {
        GroupOfCards deck = new GroupOfCards();
        PlayCard card = new PlayCard(1,4);
        deck.addCard(card);
        System.out.println(deck);
    }
}