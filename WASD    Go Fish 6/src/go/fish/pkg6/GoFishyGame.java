package ca.sheridancollege.project;
/*
 * @author Yan Z.
 * @author Ryan T.
 * @author Ninxin G.
 * @author Jaime T.
 * Date: 04/11/2021
 */
import java.util.Scanner;
/**
 *This class is used to create a new game instance. The deck is created and 
 * shuffled, the player and computer are given cards from the deck, and the 
 * game is started
 *
 */
public class GoFishyGame extends Game {

    public static Scanner input = new Scanner(System.in);
    private GroupOfCards stock;
    private GroupOfCards playerHand;
    private GroupOfCards cpHand;
    boolean win;
    private int playerBooks, cpBooks;

    public GoFishyGame() {
        super("GoFishy");
        this.getPlayers().add(new GoFishyPlayer("Computer"));
        stock = new GroupOfCards();
        stock.fullDeck();
        playerHand = new GroupOfCards();
        cpHand = new GroupOfCards();
        win = false;
        playerBooks = cpBooks = 0;

    }
/*
 *This method is the instance of the game. The player is asked whether they would
    like to quit, view the rules of the game, or begin playing.
 */
    @Override
    public void play() {
        //System.out.println("\n\n[1] Play Go Fishy\n[2] Rules of Go Fishy");
        System.out.println("\n\nLobby Menu\n\n[1] Start Go Fish\n[2] Rules of Go Fish\n[3] Description");
        int lobby = input.nextInt();
        while (lobby > 3 || lobby < 1) {
            System.out.println("Invalid input, 1, 2 or 3 Only!\nTry Again.");
            lobby = input.nextInt();
        }
        switch (lobby) {
            case 1:
                playGoFishy();
                break;
            case 2:
//            System.out.println("\n\nRULES:\n" +
//                               "The Player and the Oppent(Computer) both start with" +
//                               " 7 cards. The player\nasks for a Card by entering the value" +
//                               " as a number. Ace is 1 and Jack,\nQueen,King are 11,12,13." +
//                               "If the card you've asked for is contained in\nthe deck of" +
//                               " the oppent then you get all of their cards with that value.\n" +
//                               "If guessed incorrectly the player must draw from the Table Deck." +
//                               " If the\ncard drawn from the Table Deck then the player goes again." +
//                               "The game ends\nif either the Table Deck, Player Hand, or Computer" +
//                               " Hand are empty. The \nplayer with the most Books, which are 4 cards" +
//                               " of the same value, wins \nthe game.\n\t\tPress Enter to start the Game");
//            input.nextLine();
//            input.nextLine();
//            playGoFishy();
//            break;
                char answer;

                do {

                    System.out.println("------------------------------------------------------------");
                    System.out.println("\nRules & Steps\n");

                    System.out.println("Step 1: "
                            + "\n\nThe player and computer receive 7 cards to keep in their "
                            + "\nhand.");

                    System.out.println("\nStep 2: "
                            + "\n\nThe deck is shuffled and ready to be drawn from.");

                    System.out.println("\nStep 3: "
                            + "\n\nThe goal is to collect all 4 suits of card to earn a Book.");

                    System.out.println("\nStep 4:"
                            + "\n\n-The players starts by looking at the cards in their hand."
                            + "\n-The player ask the computer for a specific card  that is "
                            + "\ncontained in their playing hand. A good strategy is to ask for"
                            + "\ncards that you have most of."
                            + "\n-To ask for a specific card enter the value of that card as "
                            + "\na number. "
                            + "\n\nFor example: "
                            + "\n\nAce = 1"
                            + "\nJack = 11"
                            + "\nQueen = 12"
                            + "\nKing = 13"
                            + "\n2 to 10 remain their value.");

                    System.out.println("\nStep 5:"
                            + "\n\nIf the opponent's hand has any of the requested card the "
                            + "\nrequesting player gains all suits of the value guessed from"
                            + "\nthe opponent."
                            + "\nIf guessed incorrectly the player must draw from the Table "
                            + "\ndeck and if the player picks up a value that matched a value"
                            + "\nin their hand that player goes again.");

                    System.out.println("\nStep 6:"
                            + "\n\nAfter each book is made in the players hand the cards will "
                            + "\nbe removed from the playing hand and put out of play.");

                    System.out.println("\nStep 7: "
                            + "\nThe game ends if the Table Deck, User Hand, or "
                            + "\nComputerHand are empty.");

                    System.out.println("\nStep 8: "
                            + "\nThe player with the most books which are 4 cards of the "
                            + "\nsame value  wins the game.");

                    System.out.println("\n------------------------------------------------------------");

                    System.out.print("Type ready if you have read Step 1 - Step 8 of the rules: ");

                    answer = input.next().toUpperCase().charAt(0);
                } while (answer != 'R');

                play();
                break;

            case 3:

                System.out.println("\n------------------------------------------------------------");

                do {
                    System.out.println("Description\n\n");

                    System.out.println("Go Fishy is a card game played with a standard 52 card "
                            + "\ndeck but without the jokers.The object of the game is to "
                            + "\ncollect all 4 suits of a card to earn a \"Book\".  7 cards "
                            + "\nare dealt to the player and computer.  Each player and "
                            + "\ncomputer will take turns asking eachother for cards to "
                            + "\ncomplete a book in their hand. If the the opponent does "
                            + "\nnot have the requested card the opponent says Go Fishy! "
                            + "\nand the requesting player must draw a card from the table "
                            + "\ndeck. The game is over if all books have been collected or "
                            + "\nall cards have been dealt. The player with the most books "
                            + "\nwins the game.");

                    System.out.println("\n------------------------------------------------------------");
                    System.out.print("Type ready if you have read the Description: ");

                    answer = input.next().toUpperCase().charAt(0);
                } while (answer != 'R');

                play();
                break;

        }

    }
    /*
     *This method sets up the game-loop. First the player plays their turn, then 
     * the game is checked for game-over. Then the computer plays their turn, and
     * again, we check for game-over. While nobody has won, this loop continues 
     * to run.
     */
    public void playGoFishy() {
        initializeStartingHands();
        checkStartingDeal();
        // methods to check player and computer's hands for duplicate cards
        //this.playerHand.checkHand();
        //this.cpHand.checkHand();

        do {
            playerTurn();
            checkForGameOver();

            compTurn();
            checkForGameOver();

        } while (!win);

        System.out.println("Game Over!");
        declareWinner();
    }
    /*
     *This method initializes the player and computer's starting-hands. Each 
     * player is assigned 8-random-cards to start with.
     */
    public void initializeStartingHands() {
        for (int i = 0; i < 7; i++) {
            playerHand.addCard(stock.deleteACard());
            cpHand.addCard(stock.deleteACard());
        }
    }
    /*
     *A method to check each player's starting-hand for books. If either player
     * is dealt their starting-hand and it contains a full-book, assign a point.
     */
    public void checkStartingDeal() {
        int playerStartDeal = playerHand.checkBookStartingDeal();
        if (playerStartDeal != 0) //4 occurences 
        {
            System.out.println("Wow! You got extremely lucky and got a book "
                    + "on the deal of the value " + playerStartDeal
                    + "\nThat puts you at 1 Book already!");
            pause();
            playerBooks++;
        }

        int cpStartDeal = cpHand.checkBookStartingDeal();
        if (cpStartDeal != 0) {
            System.out.println("Wow! The computer got extremely lucky and got a "
                    + "book on the deal of the value " + cpStartDeal
                    + "\nThat puts the computer at 1 Book already!");
            pause();
            cpBooks++;
        }
    }
    /*
     *A method to handle the player's turn. The player plays their turn, as long
     * as there is no winner yet. First, they are asked what value they would
     * like to ask for. They recieve their answer, yes or no, and are either 
     * given the sprecified cards, or they draw a card from the deck. If they 
     * get a match, they get another turn.
     */
    public void playerTurn() {
        boolean playerRetry = false;
        do {
            playerRetry = false;            
            if (!win) {
                PlayCard drawnCard = null;
                System.out.println(this.displayDeck(playerHand)); //playerHand);
                System.out.println("Which value would you like to ask for?");
                int value = input.nextInt();
                while (playerHand.getCount(value) == 0) {
                    System.out.println("This value is not contained in the card deck, "
                            + "Please enter another value");
                    value = input.nextInt();
                }
                int hits = cpHand.getCount(value);
                if (hits == 0) {
                    System.out.println("Go Fishy!");  //no matching, get another card
                    drawnCard = stock.deleteACard();
                    int cardValue = drawnCard.getValue();
                    if (cardValue == value) //matching card found
                    {
                        playerHand.addCard(drawnCard);
                        playerRetry = true;
                        System.out.println("Drawn Card: " + drawnCard);
                        System.out.println("Lucky Draw! Go again.");
                        pause();
                    } else {
                        System.out.println("Drawn Card: " + drawnCard);
                        playerHand.addCard(drawnCard);
                        pause();
                    }
                    int countAfterGoFishy = playerHand.getCount(cardValue);
                    if (countAfterGoFishy == 4) {
                        playerBooks++;
                        System.out.println("With that Go Fish draw you've just completed a Book"
                                + " with the value " + cardValue + "\n"
                                + "You now have : " + playerBooks + " Books\n"
                                + "And the computer has : " + cpBooks + " Books");
                        pause();
                        for (int i = 0; i < 4; i++) // 4 suits 
                        {
                            playerHand.deleteValue(cardValue);  //delete every card in the suit
                        }
                        
                        //added to remove the same value card in computer's hand 
                        cpHand.deleteValue(cardValue);
                    }
                    if (playerRetry) {
                        checkForGameOver();
                    }
                } else if (!playerRetry && hits >= 1) {
                    for (int i = 0; i < hits; i++) {
                        PlayCard pc = cpHand.deleteValue(value);
                        playerHand.addCard(pc);
                        System.out.println("The Computer had " + pc.toString());
                    }
                    if (hits == 1) {
                        System.out.println("You took this card from the computer!");
                    } else {
                        System.out.println("You took these " + hits + " cards from the computer!");
                    }

                    // System.out.println("You took these " + hits + " cards from the computer");
                    playerRetry = false;
                    pause();
                    int countAfterSteal = playerHand.getCount(value);
                    if (countAfterSteal == 4) {
                        playerBooks++;
                        System.out.println("You just got a book from stealing the computer's card(s)"
                                + " with the value " + value + "\n"
                                + "You now have : " + playerBooks + " Books\n"
                                + "The computer currently has : " + cpBooks + " Books");
                        pause();
                        for (int i = 0; i < 4; i++) {
                            playerHand.deleteValue(value);
                        }
                         //added to remove the same value card in computer's hand 
                        cpHand.deleteValue(value);
                        
                    }

                }
            }
        } while (playerRetry);
    }
    /*
     *A method to handle the computer playing their turn (automatically).
     */
    public void compTurn() {
        boolean cpRetry = false;
        do {
            cpRetry = false;
            if (!win) {
                PlayCard drawnCardCp = null;
                PlayCard randCard = cpHand.deleteACard(); //Randomly pulls asking card from computers hand
                cpHand.addCard(randCard);
                int value = randCard.getValue();
                int cpHits = playerHand.getCount(value);
                //PlayCard pc; 
                if (cpHits == 0) //go fishy!
                {
                    drawnCardCp = stock.deleteACard();
                    int cardValue = drawnCardCp.getValue();
                    if (cardValue == value)//Draw same card as asked from stock deck
                    {
                        cpHand.addCard(drawnCardCp);
                        cpRetry = true;
                        System.out.println("Lucky draw for the computer!\n"
                                + "They go again.");
                        pause();
                    } else {
                        //System.out.println("The computer guessed Wrong..\n" +
                        System.out.println("The computer guessed " + randCard.toString() + ", Wrong..\n"
                                + "Your turn.");
                        cpHand.addCard(drawnCardCp);
                        pause();
                    }
                    int cpCountAfterGoFishy = cpHand.getCount(cardValue);
                    if (cpCountAfterGoFishy == 4) //COMPLETED BOOK IN COMPUTER HAND
                    {
                        cpBooks++;
                        System.out.println("The computer just got a book off a Go Fish draw"
                                + " with the value " + cardValue + "\n"
                                + "The computer now has : " + cpBooks + " Books\n"
                                + "You currently have : " + playerBooks + " Books");
                        pause();
                        for (int i = 0; i < 4; i++) {
                            cpHand.deleteValue(cardValue);
                        }
                        //added to remove the same value card in user's hand 
                        playerHand.deleteValue(cardValue);
                        
                    }
                    if (cpRetry) {
                        checkForGameOver();
                    }
                } else if (!cpRetry && cpHits >= 1) {
                    for (int i = 0; i < cpHits; i++) {
                        PlayCard pc = playerHand.deleteValue(value);
                        cpHand.addCard(pc);
                        System.out.println("You had " + pc.toString());
                    }
                    if (cpHits == 1) {
                        System.out.println("The computer took this card from you!");
                    } else {
                        System.out.println("The computer took these " + cpHits + " cards from you!");
                    }

                    cpRetry = false;
                    pause();
                    int cpCountAfterSteal = cpHand.getCount(value);
                    //pc = cpHand.showCard(value);
                    if (cpCountAfterSteal == 4) {
                        cpBooks++;
                        System.out.println("The computer just got a book from stealing your card(s)"
                                + " with the value " + value + "\n"
                                + "The computer now has : " + cpBooks + " Books\n"
                                + "You currently have : " + playerBooks + " Books");
                        pause();
                        for (int i = 0; i < 4; i++) {
                            cpHand.deleteValue(value);
                        }
                       
                        //added to remove the same value card in computer's hand 
                        playerHand.deleteValue(value);
                    }
                }
            }
        } while (cpRetry);
    }
    /*
     *A method to ensure there are cards to left to be played.
     */
    public void checkForGameOver() {
        win = (stock.getSize() == 0 || playerHand.getSize() == 0
                || cpHand.getSize() == 0);
    }
    /*
     *A method to determine whether the player or the computer has won the game.
     */
    @Override
    public void declareWinner() {
        if (cpBooks > playerBooks) {
            System.out.println("The computer Won!\n"
                    + "Computer Books : " + cpBooks
                    + "\nPlayer Books : " + playerBooks);
        } else if (playerBooks > cpBooks) {
            System.out.println("Congrats YOU Won!\n"
                    + "Player Books : " + playerBooks
                    + "\nComputer Books : " + cpBooks);
        } else if (playerBooks == cpBooks) {
            System.out.println("The game was a tie!\n"
                    + "You both had " + playerBooks + " books.");
        }
    }
    /*
     *A method to display the user's deck to them upon their turn. This is so 
     * the user knows which cards they can ask the computer for this turn.
     */
    public String displayDeck(GroupOfCards gc) {

        String userDeck = gc.toString();

        if (gc.getSize() > 0) {
            if (!this.getPlayers().get(1).getName().isEmpty()) {
                userDeck = this.getPlayers().get(1).getName() + "'s " + userDeck.substring(4);
            }
        }
        return userDeck;

    }

//   public String yesNo() 
//   {
//      String yesNo = new String();
//         do 
//         {
//            yesNo = input.nextLine();
//            if (!yesNo.equalsIgnoreCase("yes")
//            	&& !yesNo.equalsIgnoreCase("no")) 
//            {
//               System.out.println("Yes or No only!  Try again");
//            }
//         }while (!yesNo.equalsIgnoreCase("yes")
//         	&& !yesNo.equalsIgnoreCase("no"));
//      
//         return yesNo;
//   }
    public static Scanner pauseScanner = new Scanner(System.in);
    /*
     *A method to use whenever we need to give the user a chance to read the 
     * game-prompt they are given.
     */
    public void pause() {
        System.out.println("Press Enter to continue..");
        pauseScanner.nextLine();
    }

}
