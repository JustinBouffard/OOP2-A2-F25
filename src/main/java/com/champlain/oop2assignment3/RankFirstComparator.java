package com.champlain.oop2assignment3;


import java.util.Comparator;

/**
 * A {@link Comparator} used to sort {@link Card} objects based on a rank first algorithm.
 *
 * @author Justin Bouffard
 */
public class RankFirstComparator implements Comparator<Card> {
    /**
     * Compares two {@link Card} objects by rank first, then by suit if the ranks are equal.
     *
     * @param card1 The first card to compare.
     * @param card2 The second card to compare.
     * @return Negative int if {@code card1} is less than {@code card2} and a positive int if {@code card1} is greater than {@code card2}
     * based on rank, then based on suit if they are the same rank.
     */
    @Override
    public int compare(Card card1, Card card2) {
        int rankComparison = card1.getRank().compareTo(card2.getRank());
        if (rankComparison != 0) {
            return rankComparison;
        }
        return card1.getSuit().compareTo(card2.getSuit());
    }
}