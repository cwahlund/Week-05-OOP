package week05OOP;

public class App {

	public static void main(String[] args) {
		SpacedLogger sLogger = new SpacedLogger();
		AsteriskLogger aLogger = new AsteriskLogger();

		sLogger.Log("Choice");
		sLogger.Error("Choice");
		
		System.out.println();
		
		aLogger.Log("Choice");
		aLogger.Error("Choice");
	}

}
