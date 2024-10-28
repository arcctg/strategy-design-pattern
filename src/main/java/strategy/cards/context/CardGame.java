package strategy.cards.context;

import strategy.cards.interfaces.game.Card;
import strategy.cards.interfaces.strategy.CardDealingStrategy;

import java.util.List;
import java.util.Map;

public class CardGame {
    private CardDealingStrategy strategy;

    public void setStrategy(CardDealingStrategy strategy) {
        this.strategy = strategy;
    }

    public Map<String, List<Card>> dealCards(int players) {
        return strategy.dealStacks(players);
    }

    public Map<String, List<Card>> dealCards(String players) {
        return strategy.dealStacks(Integer.parseInt(players));
    }
}
