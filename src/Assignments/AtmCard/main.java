package Assignments.AtmCard;

import java.util.Random;
import java.util.UUID;

import static Assignments.AtmCard.CardType.MASTER_CARD;

public class main {


	public static void main(String[] args) {
		AtmCard card_1 = new AtmCard("Adesoba", "Adefolarin", "Samson", "UBA", MASTER_CARD);
		card_1.getCardDetails();
//		card_1.validate();


}
}
