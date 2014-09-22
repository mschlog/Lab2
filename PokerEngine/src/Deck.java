//Matthew Schlogel
//Deck Class
//Lab2

import java.util.Collections;
import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck (){
	 	
		for (int suits=1; suits<=4; suits++){
			for (int ranks=1; ranks<=13; ranks++){
				cards.add(new Card(suits, ranks));
				}
			}
	}
	
	public void shuffleDeck(ArrayList<Card> c){
		Collections.shuffle(c);
	}
	
	//Drawing a card will get the first card in the array, and also remove it from the deck.
	
	public Card drawCard(){
		Card drawcard = cards.get(0);
		cards.remove(0);
		return drawcard;
	}
	
	private int Cardsremaining(){
		return cards.size();
	}
	
	public static void main(String[] args){
		Deck test = new Deck();
		System.out.println(test.drawCard());
		System.out.println(test.drawCard());
		System.out.println(test.Cardsremaining());
		//The deck is drawing different randomized cards, so shuffle is working.
		//When I draw two cards from my 52 card deck it returns 50 so my cardsize method is working.
	}
	
	}