package ca.sheridancollege.project;
/**
 * This class creates an instance of a specific card.
 *
 * @author Yan Z.
 * @author Ryan T.
 * @author Ninxin G.
 * @author Jaime T.
 * Date: 04/11/2021
 */
public class PlayCard extends Card {
    
   private int suit, value;
   
   public PlayCard(int value,int suit)
   {
      this.value = value;
      this.suit = suit;
   }
   
   @Override
   public String toString()
   {
      String valueName = "";
      if(value > 10)
      {
         switch(value)
         {
            case 11:
               valueName = "Jack of ";
               break;
            case 12:
               valueName = "Queen of ";
               break;
            case 13:
               valueName = "King of ";
               break;
         }
       }else if(value == 1)
       {
         valueName = "Ace of ";
       }else
         valueName = "" + value + " of ";
      
       String suitName = "";
       if(suit >= 1 && suit <= 4)
       {
         switch(suit)
         {
            case 1:
               suitName = "Clubs";
               break;
            case 2:
               suitName = "Diamonds";
               break;
            case 3:
               suitName = "Hearts";
               break;
            case 4:
               suitName = "Spades";
               break;
         }
       }
       return valueName + suitName;
          
   }
   public int getSuit()
   {
      return suit;
   }
   public int getValue()
   {
      return value;
   }

}
    
    
    
    
 