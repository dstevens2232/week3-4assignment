package week5HW;

public class SpacedLogger implements Logger{
	@Override
	public void log(String message) {
		
		for(int i = 0; i<message.length();i++){
			System.out.println(message.charAt(i) + " ");
		}
		
	}
	
	@Override
	public void error(String message) {
		System.out.println("ERROR: ");
		for(int i = 0; i<message.length();i++) {
			System.out.println(message.charAt(i) + " ");
		}
	}

}
