package Interface;

import Poker.PicturePokerCard;
import Poker.PicturePokerHandValues;
import java.util.*;

public interface PicturePokerCheckHand {
    PicturePokerHandValues checkhand(List<PicturePokerCard> cardList);
}