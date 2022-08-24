package SsangYong220824;

import java.util.ArrayList;
import java.util.Collections;

class Card1{
	String suit;
	String number;
	
	public Card1(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}
	public String toString() {
		return suit + " " + number;
	}
	public String getNumber() {
		return number;
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
	public int isOnePair() {
		int n = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i).getNumber().equals(list.get(j).getNumber())) {
					String number = list.get(i).number;
					//1,2,3,4,5,6,7,8,9,10
					//jack,queen,king,ace
					// 11   12    13   14
					
					switch(number) {
						case "Jack" : n = 11; break;
						case "Queen" : n = 12; break;
						case "King" : n = 13; break;
						case "Ace" : n = 14; break;
						default : n = Integer.parseInt(list.get(i).number);
					}
				}
				
			}
		}
		return n;	
	}
}
//		int n = Integer.parseInt(data)

	
public class CardTest02 {
		
	public static void main(String[] args) {
		CardDeck1 d = new CardDeck1();
		d.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			p1.getCard(d.deal());
			p2.getCard(d.deal());
		}
		p1.showCard();
		p2.showCard();
		if (p1.isOnePair() > 0)
			System.out.println("경기자 1 은 원페어입니다.");
		if (p2.isOnePair() > 0)
			System.out.println("경기자 2 은 원페어입니다.");
		if (p1.isOnePair() == p2.isOnePair())
			System.out.println("비겼습니다.");
		else if(p1.isOnePair() > p2.isOnePair())
			System.out.println("경기자 1이 이겼습니다.");
		else
			System.out.println("비겼습니다.");
		
//		System.out.println(p1.isOnePair() > p2.isOnePair() ? p1.isOnePair() : p2.isOnePair());
		
		
		
//		System.out.println("꺼내온카드" + card);	//꺼내온카드
//		System.out.println(d.deck);				//꺼낸 카드외 카드 출
//		
//		p.getCard(card);						//꺼내온카드를 Player p 객체에 전달 
//		p.showCard(card);						//Player p 카드 출력
		
	}
}