public class SchaltjahrBerechner {

	boolean istSchaltJahrG(int jahr) {
		return istSchaltJahr1(jahr) || istSchaltJahr2(jahr);
	}

	boolean istSchaltJahr1(int jahr) {
		return (jahr % 4 == 0) && (jahr % 100 != 0);
	}

	boolean istSchaltJahr2(int jahr) {
		return jahr % 400 == 0;
	}

	boolean istSchaltJahrI(int jahr) {
		return (jahr % 30 == 2) || (jahr % 30 == 5) || (jahr % 30 == 7)
				|| (jahr % 30 == 10) || (jahr % 30 == 13) || (jahr % 30 == 16)
				|| (jahr % 30 == 18) || (jahr % 30 == 21) || (jahr % 30 == 24)
				|| (jahr % 30 == 26) || (jahr % 30 == 29);
	}

	boolean istSchaltJahrJ(int jahr) {
		return (jahr % 19 == 0) || (jahr % 19 == 3) || (jahr % 19 == 6)
				|| (jahr % 19 == 8) || (jahr % 19 == 11) || (jahr % 19 == 14)
				|| (jahr % 19 == 17);
	}

}
