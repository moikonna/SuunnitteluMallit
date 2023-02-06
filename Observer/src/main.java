public class main {
	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		DigitalClock digitalClock = new DigitalClock(timer);
		timer.setHour(10);
		timer.setMinute(10);
		timer.setSecond(10);
	}
}
