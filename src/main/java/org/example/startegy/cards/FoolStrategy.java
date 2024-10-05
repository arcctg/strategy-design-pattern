package org.example.startegy.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FoolStrategy implements CardDealingStrategy {
    private static final int PER_PLAYER = 6;
    private static final int ADD_STACK = 1;
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        TreeMap<String, List<Card>> treeMap = new TreeMap<>();
        List<Card> additionalStack = new ArrayList<>();

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

        // Deal additional stack cards
        for (int i = 0; i < ADD_STACK; i++) {
            additionalStack.add(deck.dealCard());
        }
        treeMap.put("Trump card", additionalStack);

        // Handle remaining cards
        if (deck.size() != 0) treeMap.put("Remaining", deck.restCards());

        return treeMap;
    }
}
