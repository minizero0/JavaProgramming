package SsangYong220824;

import java.util.ArrayList;

class Card{
	private String suit;
	private String number;
	
	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}
	public String toString() {
		return suit + "," + number;
	}
}

class CardDeck{
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public CardDeck() {
		String suit[] = {"Clubs","Diamonds","Hearts","Spades"};
		String number[] = {"1","2","3","4","5","6","7","8","9","10",
							"Jack","Queen","King","Ace"};
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < number.length; j++) {
				deck.add(new Card(suit[i],number[j]));
			}
		}
	}
}

public class CardTest {

	public static void main(String[] args) {
		CardDeck d = new CardDeck();
		System.out.println(d.deck);
	}
}
