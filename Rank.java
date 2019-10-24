package classes;

public enum Rank {
	/**
	 * Passed in two values to make sure that the user 
	 * get's the value he wants.
	 */
	//JOKER(0, "(^.^)"),
    ACE(1, "A"), DEUCE(2, "2"),
    THREE(3, "3"), FOUR(4, "4"),
    FIVE(5, "5"), SIX(6, "6"),
    SEVEN(7, "7"), EIGHT(8, "8"),
    NINE(9, "9"), TEN(10, "10"),
    JACK(10, "J"), QUEEN(10, "Q"), KING(10, "K");
	private final int rankValue;
	private final String rankString;

	private Rank(int rankValue, String rankString) {
		this.rankValue = rankValue;
		this.rankString = rankString;
	}

	public int getRank() {
		return rankValue;
	}

	public String showRank() {
		return rankString;
	}

}
