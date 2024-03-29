package ca.sheridancollege.project;
import java.util.Scanner;
/**
 * This class creates a new game-instance of GoFishy. The game is initialized 
 * directly when the program is run. Allows the player to quit, play GoFishy, or
 * Test out the classes/deck to ensure everything is functioning correctly.
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Yan Z.
 * @author Ryan T.
 * @author Ninxin G.
 * @author Jaime T.
 * Date: 04/11/2021
 */
public class GoFishy {
  
   public static Scanner input = new Scanner(System.in);
   
   public static void main(String[]args) {
 
      boolean replay = true;
      int menu;
      do
      {
         System.out.println("\n\n\n[1] Test Deck Hand Class\n[2] Play Go Fish\n[3] Exit");
         menu = input.nextInt();
         switch(menu)
         {
            case 1:
               testDecks();
               break;
            case 2:
                System.out.println("Please enter player's name:");
                input.nextLine(); //flashing the input stream
                String playerName = input.nextLine();
                GoFishyPlayer player = new GoFishyPlayer(playerName.trim());
               
                player.play();
//               GoFishGame game = new GoFishGame();
//               break;
            case 3:
               replay = false;
               break;
         }
         
      }while(replay);
      
      System.out.println("Goodbye!");
   }
   
   
   public static void testDecks()
   {
      boolean repTest = true;
      int hand;
      GroupOfCards fullDeck;
      GroupOfCards emptyHand;
      do
      {
         System.out.println("Which Deck would you like to manipulate?\n" +
                            "[1] Empty Hand\n[2] Full Deck\nEnter the Corresponding number");
         hand = input.nextInt();
         switch(hand)
         {
            case 1:
               emptyHand = new GroupOfCards();
               repTest = testDeck(emptyHand);
               break;
            case 2:
               fullDeck = new GroupOfCards();
               fullDeck.fullDeck();
               repTest = testDeck(fullDeck);
               break;
         }
      }while(repTest);
   }
   
   public static boolean testDeck(GroupOfCards deck)
   {
       PlayCard temp;
       int menu;
       boolean repDeckTest = true;
       do
       {
            System.out.println("[1] Insert Card\n[2] Delete Card Value\n[3] Delete Random Card\n" +
                               "[4] Test number times a specific value Occurs in Hand\n" +
                               "[5] Print Total number of Cards in Deck\n" +
                               "[6] Display Entire Deck hand\n" +
                               "[7] Change/Restart Decks\n[8] Exit Test");
            menu = input.nextInt();
            switch(menu)
            {
               case 1:
                  int suit, value;
                  System.out.println("Please enter the Card ID you'd like to insert\n" +
                                     "Both Value and Suit are represented by Integers\nSuits:\n" +
                                     "\t1 = Clubs\n\t2 = Diamonds\n\t3 = Hearts\n\t4 = Spades\n" +
                                     "Enter the Integer Corresponding to the Suit");
                  suit = input.nextInt();
                  System.out.println("Okay, now enter the Value for the Card as an integer.");
                  value = input.nextInt();
                  PlayCard insert = new PlayCard(value, suit);
                  deck.addCard(insert);
                  System.out.println("Card inserted");
                  break;
               case 2:
                  int deleteVal;
                  System.out.println("Which card Value would you like to search and Delete?\n" +
                                     "Enter the integer Representation of the Value");
                  deleteVal = input.nextInt();
                  PlayCard deleteCard;
                  deleteCard = deck.deleteValue(deleteVal);
                  if(deleteCard == null)
                     System.out.println("Card not found.");
                  else
                     System.out.println("Card Deleted: " + deleteCard);
                  break;
               case 3:
                  PlayCard randomDelete;
                  randomDelete = deck.deleteACard();
                  if(randomDelete == null)
                     System.out.println("Empty Hand");  
                  else
                     System.out.println("Card deleted : " + randomDelete);
                  break;
               case 4:
                  System.out.println("Which value would you like Search for?");
                  int searchVal = input.nextInt();
                  System.out.println("That value occurs " + deck.getCount(searchVal) +
                                     " times in the Deck Hand");
                  break;
               case 5:
                  System.out.println("Total number of Cards in Deck : " + deck.getSize());
                  break;
               case 6:
                  System.out.println(deck);
                  break;
               case 7:
                  repDeckTest = false;
                  return true;
               case 8:
                  repDeckTest = false;
                  return false;
            }
       }while(repDeckTest);
       
       return true;
    
   }
    
    
    
    
    
    
    

}
