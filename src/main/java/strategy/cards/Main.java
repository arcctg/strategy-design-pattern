package strategy.cards;

import strategy.cards.context.CardGame;
import strategy.cards.implementations.strategy.Bridge;
import strategy.cards.implementations.strategy.ClassicPoker;
import strategy.cards.implementations.strategy.Fool;
import strategy.cards.implementations.strategy.TexasPoker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardGame cardGame = new CardGame();

        System.out.println("""
                What card game do you wanna play?
                1. Bridge
                2. Fool
                3. Classic Poker
                4. Texas Poker
                """);

        String input;

        while (!(input = scanner.nextLine().toLowerCase().trim())
                .matches("1|bridge|2|fool|3|classic poker|4|texas poker")) {
            System.out.println("Invalid choice. Try again.");
        }

        switch (input) {
            case "1", "bridge" -> cardGame.setStrategy(new Bridge());
            case "2", "fool" -> cardGame.setStrategy(new Fool());
            case "3", "classic poker" -> cardGame.setStrategy(new ClassicPoker());
            case "4", "texas poker" -> cardGame.setStrategy(new TexasPoker());
        }

        System.out.println("\nHow many players are there?");

        while (!(input = scanner.next()).matches("\\d") || Integer.parseInt(input) <= 0) {
            System.out.println("Invalid input. Try again.");
        }

        System.out.println(cardGame.dealCards(input).toString());
    }
}
