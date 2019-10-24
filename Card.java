package classes;

public class Card {
	private Rank rank;
	private Suit suit;
	private boolean faceUp; // to determine the state of the card

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		faceUp = true;
	}

	// Getters
	public int getRank() {
		return rank.getRank();
	}

	public String getSuit() {
		return suit.getSuit();
	}

	@Override
	public String toString() {
		String message = "";

		if(faceUp) {
			message += suit.getSuit() + rank.showRank();
			return message;
		}
		return "[?]";
	}

	/**
	 * This method flips the cards
	 */
	public void flip(Card card) {
		card.flip(card);
	}
}
