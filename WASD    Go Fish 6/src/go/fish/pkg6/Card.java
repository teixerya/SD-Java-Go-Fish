/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * @author Yan Z.
 * @author Ryan T.
 * @author Ninxin G.
 * @author Jaime T.
 * Date: 04/11/2021
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * -- PlayCard class
 * @author dancye
 * @author jtava
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     * this method is re-implemented, using abstraction within the PlayCard class
     */
    @Override
    public abstract String toString();

}
