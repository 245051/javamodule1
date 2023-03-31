package enums;

import java.time.DayOfWeek;

public class TestEnum {
	public static void main(String[] args) {
		DayofWeek today = DayofWeek.SATURDAY;
		System.out.println("Today is"+today.getName());
		switch(today) {
		case MONDAY:
			System.out.println("Work hard");
			break;
		case TUESDAY:
			System.out.println("Work little");
			break;
		case WEDNESDAY:
			System.out.println("Work work little more");
			break;
		case THURSDAY:
			System.out.println("Working work more,WEEKEND is Around");
			break;
		case FRIDAY:
			System.out.println("YEAH weekend has arrived ,party hard");
			break;
		case SATURDAY:
			System.out.println("enjoy morning coffee go shopping");
			break;
		case SUNDAY:
			System.out.println("do ALL CLEANING WORKS ,SNOZZZZZZZZZZZZ");
			break;
			
		}
		
	}
}
