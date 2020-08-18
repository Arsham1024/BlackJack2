import java.util.*;
public class Deck {

   private Card [] myCards;
   private int numCards;

   public Deck (){
      this (1, false);
   }
   public Deck (int numDecks, boolean shuffle){
      this.numCards = numDecks * 52;
      this.myCards = new Card[this.numCards];

      //init card Index
      int i = 0;

      //for each deck
      for (int j = 0; j < numDecks ; j++) {
         //for each suit
         for (int k = 0; k < 4 ; k++) {
            //for each number
            for (int l = 0; l < 13 ; l++) {
               this.myCards[i] = new Card (Suit.values()[k],l);
               i++;
            }
         }
      }

      //shuffle if necessary

      if (shuffle){
         this.shuffle();
      }
   }
   private void shuffle() {
      //init random number generator
      Random rand = new Random();
      //temp card
      Card temp;

      int i;
      for (int j = 0; j <this.numCards ; j++) {

         //get a random card to swap j's value with
         i = rand.nextInt(this.numCards);

         //do the swap
         temp = this.myCards[j];
         this.myCards [j] = this.myCards [i];
         this.myCards [i] = temp;
      }

   }
   public Card dealNextCard(){
      //get the top card
      Card top = null;
      try {
         top = this.myCards[numCards];
         //decrement the number o cars in the deck
         numCards--;
      }catch (NullPointerException e){
         System.out.println(e.getCause() + "The deck is empty");
      }
      return top;
   }
   public void printDeck (int numToPrint){
      for (int i = 0; i <numToPrint ; i++) {
         System.out.printf("% 3d/%d %s\n", i+1, this.numCards, this.myCards[i].toString());
      }
   }
}
