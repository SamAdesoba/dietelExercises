package chapterThree;

import java.util.Scanner;

public class PetrolMain {
	private static Scanner input =new Scanner(System.in);
	public static void main(String[] args) {
	getStationLocation();
	getPetrolType();
	getNetPurchase();
}

	private static double getNetPurchase() {
		PetrolPurchase fueling = new PetrolPurchase("Ikeja", "Diesel", 2, 2.0, 1.0);
		System.out.println("The net purchase is " + fueling.getPurchaseAmount());
		return fueling.getPurchaseAmount();
	}

	private static String getPetrolType() {
		PetrolPurchase fueling = new PetrolPurchase("Ikeja", "Diesel", 40, 32.0, 5.0);
		System.out.println("The petrol type is " + fueling.getPetrolType());
		return fueling.getPetrolType();
	}

	private static String getStationLocation(){
		PetrolPurchase fueling = new PetrolPurchase("Ikeja","Diesel",40,32.0,5.0);
		System.out.println("Station Location is "+fueling.getStationLocation());
		return fueling.getStationLocation();

	}
}
