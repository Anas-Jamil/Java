public class q2 {

    public static void main (String [] args) {
        class Rank {
        enum Card {ZERO, ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
        }
        Rank.Card highCard = Rank.Card.ACE;
        Rank.Card faceCard = Rank.Card.KING;
        Rank.Card card1 = Rank.Card.TEN;
        Rank.Card card2 = Rank.Card.SIX;
        System.out.println("A blackjack hand: " + highCard+ " and " + faceCard);
        int card1Val = card1.ordinal();
        int card2Val = card2.ordinal();
        System.out.println("A two hand card: " + card1 + ' ' + card2  + "\nHand Value:" + (card1Val+card2Val));
    }
}