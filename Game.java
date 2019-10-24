package classes;

public class Game {
	public static void main(String[] args) {
		// Let's create the cards
		Card c1 = new Card(Rank.ACE, Suit.HEARTS);
		Card c2 = new Card(Rank.JACK, Suit.DIAMONDS);
		Card c3 = new Card(Rank.QUEEN, Suit.SPADES);
		Card c4 = new Card(Rank.DEUCE, Suit.HEARTS);
		Pile deck1 = new Pile(52);
		Pile deck2 = new Pile(52);

		deck1.add(c1);
		deck1.add(c2);
		System.out.print(deck1.showDeck());
		deck1.remove(c1);
		System.out.print(deck1.showDeck());
		deck2.add(c3);
		deck2.add(c4);
		System.out.println(deck2.showDeck());

		// Creating the deck
		Pile deck3 = new Pile(52);
		deck3.toFill();
		System.out.println("Deck 3 has following cards: \n" + deck3.showDeck());

		System.out.print("<♥----♠--------♣--♦");
		// Shuffling deck3
		deck3.shuffle();
		System.out.print("\nDeck 3 shuffled: \n" + deck3.showDeck()); // should be a random deck
		System.out.print("♦---♣--------♠---♥>\n");
		
		deck3.clear();
		System.out.println("Deck3 has been cleared" + deck3.showDeck());
		
		System.out.println(deck1.checkCard(c2, deck1)); // should be true
		System.out.println(deck2.checkCard(c2, deck3)); // should be false
	}

}
