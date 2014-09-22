//Matthew Schlogel
//Hand Class
//Lab2

import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	
	private ArrayList<Card> cardsInHand = new ArrayList<Card>();
	
	public Hand(Deck hand){
		for (int handcards =1; handcards<=5; handcards++){
			Card addcard = hand.drawCard();
			cardsInHand.add(addcard);
		}	
	}
	
	private int Cardsremaining(){
		return cardsInHand.size();
	}
	
	public static double judge(Hand playHand){
		return 2;
	}
	
	//____________________________________________________TESTS____
	public static void main(String[] args){
		Deck test = new Deck();
		Hand testhand = new Hand(test);
		System.out.println(test.drawCard());
		System.out.println(test.drawCard());
		System.out.println(test.drawCard());
		System.out.println(testhand.Cardsremaining());
		//Saying that each of my hands have 5 cards. Passes.

}
}