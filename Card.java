public class Card {
   private Suit mySuit;
   private int myNumber;

   public Card (Suit aSuit, int aNumber){
      this.mySuit = aSuit;
      if (aNumber>=1 && aNumber<= 13) {
         this.myNumber = aNumber;
      }else {
         System.err.print(aNumber + " is not a valid Card number.");
         System.exit(1);
      }
   }

   //Getter methods here.
   public Suit getMySuit() {
      return mySuit;
   }

   public int getMyNumber() {
      return myNumber;
   }

    public String toString (){
      String s = null;

      //could do this with an Array
      switch (this.myNumber){
         case 2:
            s = "two";
            break;
         case 3:
            s = "three";
            break;
         case 4:
            s = "four";
            break;
         case 5:
            s = "five";
            break;
         case 6:
            s = "six";
            break;
         case 7:
            s = "seven";
            break;
         case 8:
            s = "eight";
            break;
         case 9:
            s = "nine";
            break;
         case 10:
            s = "ten";
            break;
         case 11:
            s = "jack";
            break;
         case 12:
            s = "queen";
            break;
         case 13:
            s = "king";
            break;
         case 1:
            s = "Ace";
            break;
      }

      return s + " of " + mySuit.toString();
    }
}
