package classes;

public interface CardListInterface {
	public void add(Card aCard);
	public boolean remove(Card aCard);
	public void clear();
	public boolean checkCard(Card c, Pile deck);
	public int getTotal();
	public void toFill();
	public void cutDeck();
	public  void repartCards(Pile[] hands, int hand);
	public void repartCards(Pile hand, int oneHand);
	
}
