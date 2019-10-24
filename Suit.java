package classes;

public enum Suit {
	//JOKER("(^.^)"), 
    HEARTS("♥"),
    SPADES("♠"),
    DIAMONDS("♦"),
    CLUBS("♣");
	private final String suitText;
	
	private Suit(String suitText) {
		this.suitText = suitText;
	}
	
	public String getSuit() {
		return suitText;
	}
}
