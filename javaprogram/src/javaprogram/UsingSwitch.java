package javaprogram;

public class UsingSwitch {

	public static void main(String[] args) {
		System.out.println(deterMineDay(7));

	}

	private static String deterMineDay(int dayNumber) {
		switch (dayNumber) {
		case 0 :return  "SUNDAY";
		case 1:
			return "MONDAY";
		case 2:
			return "TUESDAY";
		case 3:
			return "WEDNESDAY";
		case 4:
			return "THURSDAY";
		case 5:
			return "FRIDAY";
		case 6:
			return "SATURDAY";
		default:
			return "INVALID DAY ";

		}

	}

}
