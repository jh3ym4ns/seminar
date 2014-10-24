
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fehler2 fehler2 = new Fehler2();
		
		Integer ergebnis = fehler2.addValues(1,2);
		System.out.println("Summe von 1 und 2 ist: " + ergebnis);
		
		fehler2.printString("Dieser String wird 5 mal ausgegeben");
		
		fehler2.printNumber(10, 12);
		
	}

}
