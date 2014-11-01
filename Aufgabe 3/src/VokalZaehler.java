
public class VokalZaehler {
	
	public Integer zaehleVokale(String zeichenKette) {
		// In Java ist das erste Element einer Liste oder eines Strings
		// immer an Position 0 gespeichert, und das letzte Element an
		// Position "länge - 1".
		Integer aktuellePosition = 0;
		Integer letztePosition = zeichenKette.length()-1;
		Integer anzahlVonA = 0;
		Integer anzahlVonE = 0;
		Integer anzahlVonI = 0;
		Integer anzahlVonO = 0;
		Integer anzahlVonU = 0;
		
		zeichenKette = zeichenKette.toLowerCase();
		
		// Schleife über alle Zeichen:
		while(aktuellePosition <= letztePosition) {
			// Der aktuelle Buchstabe wird über die Methode 'charAt'
			// der Klasse String geholt:
			Character buchstabe = zeichenKette.charAt(aktuellePosition);
			// Prüfen, ob es sich um ein a handelt:
			if(buchstabe == 'a') {
				anzahlVonA++; // Falls ja, wird die Anzahl aller a's erhöht
			}
			else if(buchstabe == 'e') {
				anzahlVonE++; // Falls ja, wird die Anzahl aller e's erhöht
			}
			else if(buchstabe == 'i') {
				anzahlVonI++; // Falls ja, wird die Anzahl aller i's erhöht
			}
			else if(buchstabe == 'o') {
				anzahlVonO++; // Falls ja, wird die Anzahl aller o's erhöht
			}
			else if(buchstabe == 'u') {
				anzahlVonU++; // Falls ja, wird die Anzahl aller u's erhöht
			}
			// Schließlich wird die aktuelle Position im String hochgesetzt,
			// damit beim nächsten Schleifendurchlauf das nächste Zeichen analysiert
			// werden kann.
			aktuellePosition++;
		}

		Integer summeVokale = anzahlVonA + anzahlVonE + anzahlVonI + anzahlVonO + anzahlVonU;
		
		// Ausgabe:
		System.out.println("Anzahl aller a's in '" + zeichenKette + "': " + anzahlVonA);
		System.out.println("Anzahl aller e's in '" + zeichenKette + "': " + anzahlVonE);
		System.out.println("Anzahl aller i's in '" + zeichenKette + "': " + anzahlVonI);
		System.out.println("Anzahl aller o's in '" + zeichenKette + "': " + anzahlVonO);
		System.out.println("Anzahl aller u's in '" + zeichenKette + "': " + anzahlVonU);
		System.out.println("Anzahl aller Vokale in '" + zeichenKette + "': " + summeVokale);
		return summeVokale;
	}

}
