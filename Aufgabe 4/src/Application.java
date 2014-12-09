public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntervallAddierer intervall = new IntervallAddierer();
		Integer von = 2;
		Integer bis = 5;
		Integer ergebnis;

		ergebnis = intervall.addiereVonBis(von, bis);
		System.out.println("Das Ergebnis der Addition der Zahlen von " + von
				+ " bis " + bis + " ist: " + ergebnis);
	}

}
