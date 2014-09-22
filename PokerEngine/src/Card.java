//Matthew Schlogel
//Card Class
//LAB2

public class Card {

	//Class for cards
	
	private int rank;
	private int suit;
	
	
	//A set of related constants called enumerations
	
	public enum aSuit{
		CLUB, DIAMOND, HEART, SPADE
	}
	public enum aRank{
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	//To create a card
	
	public Card(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	//My Getter Methods
	
	//As specified in the lab getters and setters should not be public
	public int getRank(){
		return this.rank;
	}
	public int getSuit(){
		return this.suit;
	}
}
