package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * We're making a blackjack game
 * 
 * @author jimenezc1 and Jian
 *
 */
public class Pile implements CardListInterface{
	private ArrayList<Card> setOfCards;
	private int numberOfEntries;
	private static final int MAX_CAPACITY = 52;
	private Node next;
	private Node previous;

	public Pile(int capacity) {
		setOfCards = new ArrayList<Card>();
		next = null; previous = null;
		if(capacity < 2) {
			numberOfEntries = MAX_CAPACITY;
		}

		this.numberOfEntries = capacity;
	}

	/**
	 * It adds a card to the set of cards
	 */
	@Override
	public void add(Card aCard) {
		setOfCards.add(aCard);
	}

	/**
	 * It removes the element the user wants
	 */
	public boolean remove(Card aCard) {
		return setOfCards.remove(aCard);
	}

	/**
	 * It wipes out an entire set of cards
	 */
	@Override
	public void clear() {
		setOfCards.clear();
	}

	/**
	 * It shows the deck the player currently has
	 * @return message
	 */
	public String showDeck() {
		String message = "";

		for(Card c: setOfCards) {
			message += c.toString() + "\n";
		}
		return message;
	}

	/**
	 * It checks for a card and determine if it is there or not
	 */
	@Override
	public boolean checkCard(Card c, Pile deck) {
		if(setOfCards.contains(c)) {
			setOfCards.remove(c);
			deck.add(c);
			return true;
		}
		return false;
	}

	/**
	 *  It returns the total number of points in the set 
	 *  of cards the player currently has
	 */
	public int getTotal() {
		boolean hasACE = false;
		int totalPoints = 0;

		for(int i = 0; i < numberOfEntries; i++) {
			totalPoints += setOfCards.get(i).getRank();
			// How to use the ace (1 or 11)
			if(setOfCards.get(i).toString() ==  "ACE" || setOfCards.get(i).toString() ==  "Ace") { // check this
				hasACE = true;
			}

			else if(hasACE && totalPoints <= 11) {
				totalPoints += 10;
			}
		}

		return totalPoints;
	}

	/**
	 * This method loops through all the possible cards that a deck have.
	 * Including the Joker (^.^)
	 */
	public void toFill() {
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				Card card = new Card(rank, suit);
				card.getRank();
				add(card);
			}
		}
		cutDeck(); // placed here so that it does two functions in one: randomized the deck and cut it evenly
	}

	/**
	 * It takes populate() and shuffle the deck
	 */
	public void shuffle() {
		Collections.shuffle(setOfCards, new Random(MAX_CAPACITY));
	}

	//TODO: Implement this method
	public void cutDeck() {
		
	}

	/**
	 * This method simulates the dealer passing the cards to the players
	 * @param hands
	 * @param hand
	 */
	public void repartCards(Pile[] hands, int hand) {
		for(int i = 0; i < hand; i++) {
			for(int k = 0; k < numberOfEntries; k++) {
				this.checkCard(setOfCards.get(0), hands[k]);
			}
		}
	}

	/**
	 * This method simulates the dealer passing the cards to one player
	 * @param hand
	 * @param oneHand
	 */
	public void repartCards(Pile hand, int oneHand) {
		for(int i = 0; i < oneHand; i++) {
			this.checkCard(setOfCards.get(0), hand);
		}
	}

}
