package strategy.cards.implementations.game;

import strategy.cards.interfaces.game.Card;
import strategy.cards.interfaces.game.Deck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeckOfCards implements Deck {
    private final LinkedList<Card> cards;

    public DeckOfCards(int cardsAmount) {
        cards = new LinkedList<>();
        for (int i = 0; i < cardsAmount; i++) {
            cards.push(new PlayingCard(i));
        }
    }

    @Override
    public Card dealCard() {
        return cards.isEmpty() ? null : cards.pop();
    }

    @Override
    public List<Card> restCards() {
        ArrayList<Card> rest = new ArrayList<>(cards);
        cards.clear();
        return rest;
    }

    @Override
    public int size() {
        return cards.size();
    }
}
