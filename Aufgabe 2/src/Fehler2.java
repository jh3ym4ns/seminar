
class Fehler2 {
	
	Integer addValues(Integer a, Integer b) {
		int summe = a + b;
		return(summe);
	}
	
	void printString(String string) {
		for(int i = 0; i < 5; i++) {
			System.out.println(string);
			
		}
	}
	
	void printNumber(Integer zahl1, Integer zahl2) {
		Integer summe = zahl1 + zahl2;
		System.out.println("Summe von " + zahl1 + " und " + zahl2 + " ist: " + summe);
	}
	
}