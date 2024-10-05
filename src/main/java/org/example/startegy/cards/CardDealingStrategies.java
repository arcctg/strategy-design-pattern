package org.example.startegy.cards;

public class CardDealingStrategies {
    public static CardDealingStrategy texasHoldemCardDealingStrategy() {
        return new TexasPokerStrategy();
    }

    public static CardDealingStrategy classicPokerCardDealingStrategy() {
        return new ClassicPokerStrategy();
    }

    public static CardDealingStrategy bridgeCardDealingStrategy(){
        return new BridgeStrategy();
    }

    public static CardDealingStrategy foolCardDealingStrategy(){
        return new FoolStrategy();
    }

}
