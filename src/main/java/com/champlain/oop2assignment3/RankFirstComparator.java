package com.champlain.oop2assignment3;


import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int rankComparison = card1.getRank().compareTo(card2.getRank());
        if (rankComparison != 0) {
            return rankComparison;
        }
        return card1.getSuit().compareTo(card2.getSuit());
    }
}