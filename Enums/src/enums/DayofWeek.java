package enums;

public enum DayofWeek {
	MONDAY("monday"),
	TUESDAY("tuesday"),
	WEDNESDAY("wednesday"),
	THURSDAY("thursday"),
	FRIDAY("friday"),
	SATURDAY("saturday"),
	SUNDAY("sunday");
	

	
	private final String name;
	DayofWeek(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	

}
