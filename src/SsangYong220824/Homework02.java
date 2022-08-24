package SsangYong220824;

import java.util.ArrayList;
import java.util.Collections;

class Cad{
	String suit;
	String number;
	
	public Cad(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}
	public String toString() {
		return suit + " " + number;
	}
	public String GetNumber() {
		return number;
	}
}

class CadDeck{
	ArrayList<Cad> deck = new ArrayList<Cad>();
	
	public CadDeck() {
		String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String number[] = {"2","3","4","5","6","7","8","9","Jack","Queen","King","Ace"};
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < number.length; j++)
				deck.add(new Cad(suit[i], number[j]));
		}
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}
	public Cad deal() {
		return deck.remove(0);
	}
}

class Play{
	ArrayList<Cad> list = new ArrayList<Cad>();
	public void getCard(Cad card) {
		list.add(card);
	}
	public void showCards() {
		System.out.println(list);
	}
	public int isOnePair() {
		int n = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i).number.equals(list.get(j).number)) {
					String s = list.get(i).number;
					switch(s){
						case "Jack": n = 10; break;
						case "Queen": n = 11; break;
						case "King": n = 12; break;
						case "Ace" : n = 13; break;
						default : n = Integer.parseInt(s);
					}
				}
			}
		}
		return n;
	}
}

public class Homework02 {

	public static void main(String[] args) {
		CadDeck deck = new CadDeck();
		deck.shuffle();
		Play p1 = new Play();
		Play p2 = new Play();
		
		for (int i = 0; i < 5; i++) {
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		p1.showCards();
		p2.showCards();
		
		int a = p1.isOnePair();
		int b = p2.isOnePair();
		System.out.println("p1 : " + a + "pair");
		System.out.println("p2 : " + b + "pair");
		if (a > b)
			System.out.println("p1 win");
		else if (a < b)
			System.out.println("p2 win");
		else
			System.out.println("draw");
	}

}
