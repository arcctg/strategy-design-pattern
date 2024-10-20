package strategy.cards.interfaces.strategy;

import strategy.cards.interfaces.game.Card;
import strategy.cards.interfaces.game.Deck;

import java.util.List;
import java.util.Map;

public interface CardDealingStrategy {
    Map<String, List<Card>> dealStacks(int players);
}
