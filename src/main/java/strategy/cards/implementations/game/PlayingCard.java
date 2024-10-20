package strategy.cards.implementations.game;

import strategy.cards.interfaces.game.Card;

public class PlayingCard implements Card {
    private final String name;

    public PlayingCard(String name) {
        this.name = name;
    }

    public PlayingCard(final int name) {
        this.name = Integer.toString(name);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
