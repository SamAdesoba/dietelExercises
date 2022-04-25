package Assignments;

public class StudentsScoreSheet {
	private static String NAME;


	public static void setName(String name) {
		NAME = name;
	}

	public StudentsScoreSheet(String name) {
		NAME = name;

	}

	public static String getName() {
		return NAME;
	}
}
