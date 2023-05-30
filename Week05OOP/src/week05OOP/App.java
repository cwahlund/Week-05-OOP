package week05OOP;

public class App {

	public static void main(String[] args) {
		SpacedLogger sLogger = new SpacedLogger();
		AsteriskLogger aLogger = new AsteriskLogger();

		sLogger.Log("Hello");
		sLogger.Error("Hello");
		
		System.out.println();
		
		aLogger.Log("Hello");
		aLogger.Error("Hello");
	}

}
