package strategy.cards.implementations.strategy;

import strategy.cards.implementations.game.DeckOfCards;
import strategy.cards.interfaces.game.Card;
import strategy.cards.interfaces.strategy.CardDealingStrategy;
import strategy.cards.interfaces.game.Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClassicPoker implements CardDealingStrategy {
    private static final int PER_PLAYER = 5;
    private final Deck deck = new DeckOfCards(52);
    @Override
    public Map<String, List<Card>> dealStacks(int players) {
        TreeMap<String, List<Card>> treeMap = new TreeMap<>();

        // Initialize players' cards
        for (int i = 1; i <= players; i++) {
            treeMap.put("Player " + i, new ArrayList<>());
        }

        // Deal cards to players, alternating turns for each player
        for (int i = 0; i < PER_PLAYER; i++) {
            for (int j = 1; j <= players; j++) {
                treeMap.get("Player " + j).add(deck.dealCard());
            }
        }

        // Handle remaining cards
        if (deck.size() != 0) treeMap.put("Remaining", deck.restCards());

        return treeMap;
    }
}
