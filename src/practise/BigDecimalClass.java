package practise;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BigDecimalClass {
	public static void main(String[] args) {
		BigDecimal money = new BigDecimal("2746538919.36");
		BigDecimal gbese = BigDecimal.valueOf(12538);

		DecimalFormat formatter = new DecimalFormat();
		formatter.setGroupingUsed(true);

		System.out.println(money.subtract(gbese));
		System.out.println();

		System.out.println(formatter.format(money));
		System.out.println();

		LocalDateTime myGrandMother =  LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MM-dd-yyyy hh:mm:s a");

		System.out.println(dateTimeFormatter.format(myGrandMother));
		System.out.println();

		LocalDateTime myGrandFather =  LocalDateTime.of(2022,12,19,13,40,59);
		System.out.println(dateTimeFormatter.format(myGrandFather));
	}
}
