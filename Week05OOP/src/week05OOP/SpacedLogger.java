package week05OOP;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String text) {
		StringBuilder spacedText = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			spacedText.append(text.charAt(i) + " ");
		}
		
		System.out.println(spacedText.toString());
	}

	@Override
	public void Error(String text) {
		StringBuilder spacedText = new StringBuilder("ERROR: ");

		for (int i = 0; i < text.length(); i++) {
			spacedText.append(text.charAt(i) + " ");
		}
		
		System.out.println(spacedText.toString());
	}

}
