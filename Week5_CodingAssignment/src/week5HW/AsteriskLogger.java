package week5HW;

public class AsteriskLogger implements Logger {
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}
	
	private String printStars(String message){
		String str = "***Error: " + message + "***";
		return "*".repeat(str.length());
	}
	
	@Override
	public void error(String message) {
		String star = printStars(message);
		System.out.println(star);
		System.out.println("***Error: " + message + "***");
		System.out.println(star);
	}
}
