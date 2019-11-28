package net.lsanotes.ddz.card;

import java.util.ArrayList;

/**
 * @author Muyangmin
 * @create 2015-3-23
 */
public final class Pair extends CardType implements NonBombType {

	public Pair(ArrayList<Card> list) {
		if (list == null || list.size() != 2
				|| (!(list.get(0).isSameValueAs(list.get(1))))) {
			throw new IllegalArgumentException("A pair must be 2 same cards!");
		}
		//保护性复制
		cardList = new ArrayList<>(list);
	}

	/**
	 * 实现对子牌型大小比对。
	 * @return 如果参数是炸弹，则始终返回负数；否则返回按点数的比较结果。
	 * @see net.lsanotes.ddz.card.CardType#compareTo(net.lsanotes.ddz.card.CardType)
	 */
	@Override
	public int compareTo(CardType another) {
		int superCompare = super.compareTo(another);
		if (superCompare != UNDEFINED_COMPARE) {
			return superCompare;
		}
		if (!(another instanceof Pair)) {
			throw new ClassCastException("compare to wrong object.");
		}
		return cardList.get(0).compareTo(((Pair) another).cardList.get(0));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pair ").append(cardList);
		return builder.toString();
	}
}
