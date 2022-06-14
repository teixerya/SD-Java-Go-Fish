package ca.sheridancollege.project;
/*
 * @author Yan Z.
 * @author Ryan T.
 * @author Ninxin G.
 * @author Jaime T.
 * Date: 04/11/2021
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GroupOfCards //extends GroupOfCards
{
    //The group of cards, stored in an ArrayList
    private ArrayList<PlayCard> cards;
    private int size;//the size of the grouping

    
   //private int _count;
   //private Card[] _hand;
   
   private static final int FULL = 52;
   private static Random random = new Random();
   
   
   public GroupOfCards(int size) {
        this.size = size;
   }
    
   public GroupOfCards() {
       this.cards = new ArrayList<PlayCard>();
       this.size = 0;
       //empty group
   }
    
   
 public void fullDeck()
   {
      PlayCard card;
      for(int i = 1; i <= 4; i++)
      {
         for(int j = 1; j <= 13; j++)
         {
            card = new PlayCard(j,i);
            this.addCard(card);
         }
      }
   }
   
   public void addCard(PlayCard card)
   {
    
//      if(this.size ==  this.cards.size())
//      {
//         ArrayList<PlayCard> temp = new ArrayList<PlayCard>(FULL+this.size);
//         
//         for(int i = 0; i <  this.cards.size(); i++)
//         {
//            temp.add(i, this.cards.get(i));
//         }
//         
//         this.cards = temp;
//         
//      } 
      if (card != null) {
        this.cards.add(card);
        this.size++;
      }
   }
   
   
   
   
   public PlayCard deleteValue(int value)
   {
      PlayCard temp;
      PlayCard deleted;
      
      for(int i = 0; i<this.size; i++)
      {
         temp = this.cards.get(i);
         if (temp.getValue()== value)
         {
            deleted = temp;
            this.cards.remove(i);
            this.size--;
            return deleted;
         }
      }   
      return null;      
   }
   
   
    public PlayCard deleteACard() //deleteanycard
    {
        if (this.size == 0) {
            return null;
        } else {
            int randIdx = random.nextInt(this.size);
            PlayCard temp = this.cards.get(randIdx);

            if (randIdx != this.size - 1) {
                //replace the delectted card with the last card
                this.cards.set(randIdx, this.cards.get(this.size - 1));
                this.size--;
            }else{
                this.cards.remove(this.getSize() - 1);  //remove the last cards
                this.size--;
            }
//            this.cards.remove(this.size - 1);  //remove the last cards
//            this.size--;
            return temp;
        }
    }

    public int checkBookStartingDeal() //CHECKS FOR BOOK ON OPENING DEAL
   {
      PlayCard temp;
      for(int i = 0; i<4 ; i++)  
      {
         temp = this.cards.get(i);
         if (getCount(temp.getValue()) == 4)
            return temp.getValue();
         
      }
      return 0;
   }
//     // a method to check the user's deck for duplicate cards. this method is 
//     // called in the GoFishyGame.java file, in the playGoFishy() method.
//     public void checkHand() {
//         //for each card in hand
//         for (int i = 0; i < this.getSize(); i++) {
//             // setup alias for the hand in question
//             ArrayList p = this.cards;
//             Object pp = p.toString();
//             // if the hand contains the card at the given index
//             if(p.toArray()[i].toString() == pp){
//                 // remove that duplicate card
//                 this.cards.remove(i);
//             }
//         }
//     }
    
    
   public int getCount(int value)
   {
      int occurences = 0;
    
      for(int i = 0; i<this.size;i++)
      {        
         if (this.cards.get(i).getValue() == value)
           occurences++;
         
      }
      return occurences;
   }
   
    
    public PlayCard showCard(int value)
   {
      
      for(int i = 0; i<this.size;i++)
      {        
         if (this.cards.get(i).getValue() == value)
          return this.cards.get(i);
         
      }
      return null;
   } 
    ////////////////////////////////////////////////////////////
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<PlayCard> getCards() {
        return this.cards;
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
    
    
    
    @Override
    public String toString()
   {
       if (!cards.isEmpty()) {
           String result = "User Deck: \n";
           String[] sorted = new String[13];
           
           for (int i=0; i<13; i++){
               sorted[i]="";
           }

           for (int i = 0; i < cards.size(); i++) {
               switch (cards.get(i).getValue()) {

                   case 1:
                       sorted[0] += cards.get(i).toString() + "\n";
                       break;
                   case 2:
                       sorted[1] += cards.get(i).toString() + "\n";
                       break;
                   case 3:
                       sorted[2] += cards.get(i).toString() + "\n";
                       break;

                   case 4:
                       sorted[3] += cards.get(i).toString() + "\n";
                       break;
                   case 5:
                       sorted[4] += cards.get(i).toString() + "\n";
                       break;
                   case 6:
                       sorted[5] += cards.get(i).toString() + "\n";
                       break;

                   case 7:
                       sorted[6] += cards.get(i).toString() + "\n";
                       break;
                   case 8:
                       sorted[7] += cards.get(i).toString() + "\n";
                       break;
                   case 9:
                       sorted[8] += cards.get(i).toString() + "\n";
                       break;

                   case 10:
                       sorted[9] += cards.get(i).toString() + "\n";
                       break;
                   case 11:
                       sorted[10] += cards.get(i).toString() + "\n";
                       break;
                   case 12:
                       sorted[11] += cards.get(i).toString() + "\n";
                       break;

                   case 13:
                       sorted[12] += cards.get(i).toString() + "\n";
                       break;
                   default:
                      

               }
           }
//             for (int j=1; j<=13; j++){
//                 if (cards.get(i).getValue() == j){
//                        sorted[j-1] += cards.get(i).toString() + "\n";
//                        break;
//                 
//                 else
//                    sorted[j-1]+= sorted[j-1]+"";
//             }
//             
//             
//         }
         
            for (String str : sorted) {
                result += str;
            }

//         for(int i = 0; i<cards.size(); i++)
//         {  
//                         
//            result = result + cards.get(i).toString() + "\n";
//         }
            return result;
        }
        return "Empty Hand";
    }

}
