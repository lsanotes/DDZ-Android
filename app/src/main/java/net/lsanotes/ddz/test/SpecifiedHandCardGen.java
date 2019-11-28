package net.lsanotes.ddz.test;

import java.util.ArrayList;

import net.lsanotes.ddz.card.Card;
import net.lsanotes.ddz.card.CardSuit;

public class SpecifiedHandCardGen {
	//根据指定的点数生成手牌。
	public static ArrayList<Card> createHandCards(int... cardsValue){
		if (cardsValue.length!=17){
			throw new IllegalArgumentException("length :"+cardsValue.length);
		}
		ArrayList<Card> cards = new ArrayList<>();
		for (int value:cardsValue){
			cards.add(new Card(value>=Card.CARD_VALUE_JOKER_S?CardSuit.Joker:CardSuit.Spade, value));
		}
		return cards;
	}
}
