package Exercises;

public class DayConverter {
	public static void main(String[] args) {
		daysConverter(6992);
	}


	private static void daysConverter(int days) {
		int years = days/360;
		int months = (days%360)/30;
		int day = (days%360)%30;

		if(days/360 != 0 && days > 0){
			System.out.printf("%d year ", years);
		}
		if (days%30 != 0 && days > 0){
			System.out.printf("%d months ",months);
		}
		if (((days%360)%30) != 0  && days > 0){
			System.out.printf("%d days ", day);
		}else System.out.println("Invalid Input");


	}


}
