package SsangYong220824;

import java.util.ArrayList;
import java.util.Collections;

class Card1{
	private String suit;
	private String number;
	
	public Card1(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}
	public String toString() {
		return suit + "," + number;
	}
}

class CardDeck1{
	ArrayList<Card1> deck = new ArrayList<Card1>();
	
	public CardDeck1() {
		String suit[] = {"Clubs","Diamonds","Hearts","Spades"};
		String number[] = {"1","2","3","4","5","6","7","8","9","10",
							"Jack","Queen","King","Ace"};
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < number.length; j++) {
				deck.add(new Card1(suit[i],number[j]));
			}
		}
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}
	public Card1 deal() {
		return deck.remove(0);
	}
}

class Player{
	ArrayList<Card1> list = new ArrayList<Card1>();
	public void getCard(Card1 card) {
		list.add(card);
	}
	public void showCard() {
		System.out.println(list);
	}
}

	
public class CardTest02 {
		
	public static void main(String[] args) {
		CardDeck1 d = new CardDeck1();
		d.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		Card1 card = d.deal();
		p1.getCard(d.deal());
		p2.getCard(d.deal());
		p1.showCard();
		p2.showCard();
//		System.out.println("꺼내온카드" + card);	//꺼내온카드
//		System.out.println(d.deck);				//꺼낸 카드외 카드 출
//		
//		p.getCard(card);						//꺼내온카드를 Player p 객체에 전달 
//		p.showCard(card);						//Player p 카드 출력
		
	}
}