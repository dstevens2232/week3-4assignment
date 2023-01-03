package week5HW;

public class App {
	public static void main(String[] args) {
		week5HW.Logger logger = new AsteriskLogger();
		week5HW.Logger spacedLog = new SpacedLogger();
		logger.log("Good Morning");
		System.out.println();
		logger.error("Hello there!!");
		System.out.println();
		spacedLog.log("Computer Engineering is fun");
		System.out.println();
		spacedLog.error("Hello");
	}

}
