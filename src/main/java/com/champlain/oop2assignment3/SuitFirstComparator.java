package com.champlain.oop2assignment3;


import java.util.Comparator;


/**
 * A {@link Comparator} used to sort {@link Card} objects based on a suit first algorithm.
 *
 * @author Justin Bouffard
 */
public class SuitFirstComparator implements Comparator<Card> {
    /**
     * Compares two {@link Card} objects by suit first, then by rank if the suits are equal.
     *
     * @param card1 The first card to compare.
     * @param card2 The second card to compare.
     * @return Negative int if {@code card1} is less than {@code card2} and a positive int if {@code card1} is greater than {@code card2}
     * based on suit, then based on rank if they are the same suit.
     */
    @Override
    public int compare(Card card1, Card card2) {
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }
        return card1.getRank().compareTo(card2.getRank());
    }
}
