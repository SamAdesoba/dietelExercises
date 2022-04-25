package practise;

public class Time1 {
	private int hour;
	private int minute;
	private int second;

	public Time1(int hour, int minute, int second) {
		validate(hour, minute, second);
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second){
		validate(hour, minute, second);
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		validateHourFor(hour);
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		validateMinuteFor(minute);
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		validateSecondFor(second);
		this.second = second;
	}

	private static void validate(int hour, int minute, int second){
		validateHourFor(hour);
		validateMinuteFor(minute);
		validateSecondFor(second);
	}

	private static void validateHourFor(int hour){
		boolean hourIsInvalid = hour < 0 || hour >= 24;
		if(hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
	}


	private static void validateMinuteFor(int minute){
		boolean minuteIsInvalid = minute < 0 || minute >= 60;
		if(minuteIsInvalid) throw new IllegalArgumentException("Invalid minute");
	}

	private static void validateSecondFor(int second){
		boolean secondIsInvalid = second < 0 || second >= 60;
		if(secondIsInvalid) throw new IllegalArgumentException("Invalid seconds");
	}

	public Time1(){
		this(0,0,0);
	}

	public Time1(int second){
		this(0,0,second);
	}

	public Time1(int minute, int second){
		this(0,minute,second);
	}

}
