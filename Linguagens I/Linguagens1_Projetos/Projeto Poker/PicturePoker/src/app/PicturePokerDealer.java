package app;

import Poker.PicturePokerDeck;
import Poker.PicturePokerCard;
import java.util.*;
public class PicturePokerDealer {
    private String name;
    private PicturePokerDeck deck;

    public PicturePokerDealer(String name) {
        this.name = name;
        this.deck = new PicturePokerDeck();
    }

    public String getName() {
        return name;
    }

    public PicturePokerDeck getDeck() {
        return deck;
    }

    public List<PicturePokerCard> deal(){
        List<PicturePokerCard> newHand = new ArrayList<>();
        for (int card = 0; card < 5; card++) {
            newHand.add(deck.getRandomCard());
        }
        return newHand;
    }
}

