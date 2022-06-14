/**
 * SYST 17796 Project Base code.
 * 
 * @author Yan Z.
 * @author Ryan T.
 * @author Ninxin G.
 * @author Jaime T.
 * Date: 04/11/2021
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCardsBase {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping
    
    //added by goFishy group
//    private static int FULL = 52;
//    private static Random random = new Random();

    public GroupOfCardsBase(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
//    public void fullDeck()
//   {
//      Card card;
//      for(int i = 1; i <= 4; i++)
//      {
//         for(int j = 1; j <= 13; j++)
//         {
//            card = new PlayCard(j,i);
//            this.addCard(card);
//         }
//      }
//   }
//   
//   public void addCard(Card card)
//   {
//    
//      if(this.size ==  this.cards.size())
//      {
//         ArrayList<Card> temp = new ArrayList<Card>(FULL+this.size);
//         
//         for(int i = 0; i <  this.cards.size(); i++)
//         {
//            temp.add(this.cards.get(i));
//         }
//         
//         this.cards = temp;
//         
//      } 
//      this.cards.add(card);
//      this.size++;
//   }
//   
//   
//   
//   
//   public Card deleteValue(int value)
//   {
//      Card temp;
//      Card deleted;
//      
//      for(int i = 0; i<this.size; i++)
//      {
//         temp = this.cards.get(i);
//         if (((PlayCard)temp).getValue() == value)
//         {
//            deleted = temp;
//            this.cards.remove(i);
//            return deleted;
//         }
//      }   
//      return null;      
//   }
//   
//   
//    public Card deleteACard() //deleteanycard
//    {
//        if (this.size == 0) {
//            return null;
//        } else {
//            int randIdx = random.nextInt(this.size);
//            Card temp = this.cards.get(randIdx);
//
//            if (randIdx != this.size - 1) {
//                //relace the delectted card with the last card
//                this.cards.set(randIdx, this.cards.get(this.size - 1));
//            }
//            this.cards.remove(this.size - 1);  //remove the last cards
//            return temp;
//        }
//    }
//
//    
//    
//    
//    
//    
//    
//    
//    

}//end class