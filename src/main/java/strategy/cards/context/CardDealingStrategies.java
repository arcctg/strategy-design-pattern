package strategy.cards.context;

import strategy.cards.implementations.strategy.Bridge;
import strategy.cards.implementations.strategy.ClassicPoker;
import strategy.cards.implementations.strategy.Fool;
import strategy.cards.implementations.strategy.TexasPoker;
import strategy.cards.interfaces.strategy.CardDealingStrategy;

public class CardDealingStrategies {
    public static CardDealingStrategy texasHoldemCardDealingStrategy() {
        return new TexasPoker();
    }

    public static CardDealingStrategy classicPokerCardDealingStrategy() {
        return new ClassicPoker();
    }

    public static CardDealingStrategy bridgeCardDealingStrategy(){
        return new Bridge();
    }

    public static CardDealingStrategy foolCardDealingStrategy(){
        return new Fool();
    }

}
