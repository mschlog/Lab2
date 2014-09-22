//Matthew Schlogel
//Play Class
//Lab2

public class Play {
	
	Deck playDeck = new Deck();
	Hand playHand1 = new Hand(playDeck);
	Hand playHand2 = new Hand(playDeck);

	//To determine who won the hand
	
	public static String play(){
		if (playHand1.getStrength > playHand2.getStrength){
			return ("Hand 1 Wins!");
		}
		else{
			return ("Hand 2 Wins!");
		}
	}
	
}