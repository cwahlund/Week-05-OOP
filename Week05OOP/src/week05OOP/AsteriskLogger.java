package week05OOP;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String text) {
		System.out.println("***"+ text + "***");

	}

	@Override
	public void Error(String text) {
		// TODO Auto-generated method stub
		final String beforeText= "***Error: ";
		final String afterText = "***";
		StringBuilder line = new StringBuilder();
		
		for (int i = 0; i < text.length() + beforeText.length(); i++) {
			line.append("*");
		}
		line.append("***");
		
		System.out.println(line.toString());
		System.out.println(beforeText + text + afterText);
		System.out.println(line.toString());
	}

}
