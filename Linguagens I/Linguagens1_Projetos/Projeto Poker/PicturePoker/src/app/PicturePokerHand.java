package app;

import java.util.*;

import Interface.PicturePokerCheckHand;
import Poker.PicturePokerCard;
import Poker.PicturePokerCardValues;
import Poker.PicturePokerHandValues;

public class PicturePokerHand implements PicturePokerCheckHand {
    private List<PicturePokerCard> hand;

    public PicturePokerHand(List<PicturePokerCard> hand) {
        this.hand = hand;
    }

    public List<PicturePokerCard> getHand() {
        return hand;
    }

    public void setHand(List<PicturePokerCard> hand) {
        this.hand = hand;
    }

    @Override
    public PicturePokerHandValues checkhand(List<PicturePokerCard> cardList) {
        PicturePokerHandValues handValue = PicturePokerHandValues.NONE;
        HashMap<PicturePokerCardValues, Integer> handMap = new HashMap<>();
        for (PicturePokerCardValues value : PicturePokerCardValues.values()) {
            handMap.put(value, 0);
        }
        for (PicturePokerCard card : cardList) {
            handMap.replace(card.getValue(), handMap.get(card.getValue()) + 1);
        }

        handMap.forEach((picturePokerCardValues_hashMapKey, integer_hashMapValue) -> {
            System.out.println("Chave:" + picturePokerCardValues_hashMapKey + " Value:" + integer_hashMapValue);
        });

        if (handMap.containsValue(5)) {
            handValue = PicturePokerHandValues.FLUSH;
        } else if (handMap.containsValue(4)) {
            handValue = PicturePokerHandValues.FOUR_OF_KIND;
        } else if (handMap.containsValue(3) && handMap.containsValue(2)) {
            handValue = PicturePokerHandValues.FULL_HOUSE;
        } else if (handMap.containsValue(3)) {
            handValue = PicturePokerHandValues.THREE_OF_KIND;
        } else if (handMap.containsValue(2)) {
            int pairCount = 0;
            for (int value : handMap.values()) {
                if (value == 2)
                    pairCount++;
            }
            if(pairCount == 2){
                handValue = PicturePokerHandValues.TWO_PAIRS;
            }else {
                handValue = PicturePokerHandValues.PAIR;
            }
        }
        return handValue;
    }
}